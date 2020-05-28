package com.abhisek.gateway;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abhisek.gateway.bluepay.utils.BluePay;
import com.abhisek.gateway.bluepay.utils.BluePayDataManager;
import com.abhisek.gateway.bluepay.utils.ConfigurationVO;
import com.abhisek.gateway.object.CustomerCreditCardData;
import com.abhisek.gateway.object.ResponseVO;
import com.abhisek.gateway.repository.CardDetails;
import com.abhisek.gateway.repository.CardService;

@RestController
@RequestMapping("/payment")
//@CrossOrigin(origins="http://localhost:4200")
public class PaymentController {

	@Autowired
	private BluePay payment;
	@Autowired
	private BluePayDataManager bluePayDataManager;
	@Autowired
	private ConfigurationVO configurationVO;
	@Autowired
	private CardService cardService;

	@PostMapping(path = "/chargeCustomerCC/v1.0", consumes = "application/json", produces = "application/json")
	public ResponseVO chargeCustomerCC(@RequestBody CustomerCreditCardData customerCreditCardData) throws Exception {
		ResponseVO responseVO = new ResponseVO();
		bluePayDataManager.setBluePayDataFORCC(payment, customerCreditCardData);
		payment.setBP_MERCHANT(configurationVO.getAccountName());
		payment.setBP_SECRET_KEY(configurationVO.getSecretKey());
		payment.setBP_MODE(configurationVO.getMode());
		// Makes the API Request with BluePay
		try {
			payment.process();
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.toString());
		}

		if (payment.isSuccessful()) {
			responseVO.setStatus(payment.getStatus());
			responseVO.setTransactionId(payment.getTransID());
			responseVO.setAVS(payment.getStatus());
			responseVO.setCVV2(payment.getCVV2());
			responseVO.setMaskedCardNumber(payment.getMaskedPaymentAccount());
			responseVO.setCardType(payment.getCardType());
			responseVO.setAuthCode(payment.getAuthCode());
		} else {
			responseVO.setMessage(payment.getMessage());
		}
		return responseVO;
	}

	@CrossOrigin(origins = "http://127.0.0.1:4200")
	@PostMapping(path = "/chargeCustomerWithToken/v1.0", consumes = "application/json", produces = "application/json")
	public ResponseVO chargeCustomerWithToken(@RequestBody CustomerCreditCardData customerCreditCardData)
			throws Exception {
		ResponseVO responseVO = new ResponseVO();
		bluePayDataManager.setBluePayDataFORCCToken(payment, customerCreditCardData);
		payment.setBP_MERCHANT(configurationVO.getAccountName());
		payment.setBP_SECRET_KEY(configurationVO.getSecretKey());
		payment.setBP_MODE(configurationVO.getMode());
		// Makes the API Request with BluePay
		try {
			payment.process();
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.toString());
		}

		if (payment.isSuccessful()) {
			responseVO.setStatus(payment.getStatus());
			responseVO.setTransactionId(payment.getTransID());
			responseVO.setAVS(payment.getStatus());
			responseVO.setCVV2(payment.getCVV2());
			responseVO.setMaskedCardNumber(payment.getMaskedPaymentAccount());
			responseVO.setCardType(payment.getCardType());
			responseVO.setAuthCode(payment.getAuthCode());
		} else {
			responseVO.setMessage(payment.getMessage());
		}
		return responseVO;
	}

	@CrossOrigin(origins = "http://127.0.0.1:4200")
	@PostMapping(path = "/saveCustomerData/v1.0", consumes = "application/json", produces = "application/json")
	public void saveCustomerData(@RequestBody CustomerCreditCardData customerCreditCardData) throws Exception {
		CardDetails cardDetails = new CardDetails();
		cardDetails.setCardType(customerCreditCardData.getEmail());
		cardDetails.setMaskedCardNumber(customerCreditCardData.getCardNumber());
		cardDetails.setToken(customerCreditCardData.getToken());
		cardService.save(cardDetails);
	}

	@CrossOrigin(origins = "http://127.0.0.1:4200")
	@GetMapping(path = "/getCustomerData/v1.0", produces = "application/json")
	public ArrayList<CustomerCreditCardData> getCustomerData()
			throws Exception {
		ArrayList<CustomerCreditCardData> cardList = new ArrayList<>();
		List<CardDetails> listDetails = cardService.getAll();

		for (CardDetails cardDetails : listDetails) {
			CustomerCreditCardData creditCardData = new CustomerCreditCardData();
			creditCardData.setCardNumber(cardDetails.getMaskedCardNumber());
			creditCardData.setToken(cardDetails.getToken());
			creditCardData.setEmail(cardDetails.getCardType());
			cardList.add(creditCardData);
		}
		return cardList;
	}

}
