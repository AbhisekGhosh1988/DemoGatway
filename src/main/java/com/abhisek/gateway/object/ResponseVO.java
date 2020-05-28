package com.abhisek.gateway.object;

public class ResponseVO {
	
	private String status;
	private String message;
	private String transactionId;
	private String AVS;
	private String CVV2;
	private String maskedCardNumber;
	private String cardType;
	private String authCode;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getAVS() {
		return AVS;
	}
	public void setAVS(String aVS) {
		AVS = aVS;
	}
	public String getCVV2() {
		return CVV2;
	}
	public void setCVV2(String cVV2) {
		CVV2 = cVV2;
	}
	public String getMaskedCardNumber() {
		return maskedCardNumber;
	}
	public void setMaskedCardNumber(String maskedCardNumber) {
		this.maskedCardNumber = maskedCardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	
}
