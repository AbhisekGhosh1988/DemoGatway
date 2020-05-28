package com.abhisek.gateway.bluepay.utils;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.abhisek.gateway.object.CustomerCreditCardData;

@Service
public class BluePayDataManager {
	
	
	public void setBluePayDataFORCC(BluePay payment, CustomerCreditCardData customerCreditCardData) {
		
		HashMap<String, String> customerParams = new HashMap<>();
	    customerParams.put("firstName", customerCreditCardData.getFirstName());
	    customerParams.put("lastName", customerCreditCardData.getFirstName());
	    customerParams.put("address1", customerCreditCardData.getFirstName());
	    customerParams.put("address2", customerCreditCardData.getFirstName());
	    customerParams.put("city", customerCreditCardData.getFirstName());
	    customerParams.put("state", customerCreditCardData.getFirstName());
	    customerParams.put("zip", customerCreditCardData.getFirstName());
	    customerParams.put("country", customerCreditCardData.getFirstName());
	    customerParams.put("phone", customerCreditCardData.getFirstName());
	    customerParams.put("email", customerCreditCardData.getFirstName());
	    payment.setCustomerInformation(customerParams);

	    // Set Credit Card Information
	    HashMap<String, String> ccParams = new HashMap<>();
	    ccParams.put("cardNumber", customerCreditCardData.getCardNumber());
	    ccParams.put("expirationDate", customerCreditCardData.getExpirationDate());
	    ccParams.put("cvv2", customerCreditCardData.getCvv2());
	    payment.setCCInformation(ccParams);


	    HashMap<String, String> saleParams = new HashMap<>();
	    saleParams.put("amount",customerCreditCardData.getAmount());
	    payment.sale(saleParams);


		
	}

	public void setBluePayDataFORCCToken(BluePay payment, CustomerCreditCardData customerCreditCardData) {

		HashMap<String, String> saleParams = new HashMap<>();
		saleParams.put("amount", customerCreditCardData.getAmount());
		saleParams.put("transactionID", customerCreditCardData.getToken());
		payment.sale(saleParams);

	}
	
	
	

}
