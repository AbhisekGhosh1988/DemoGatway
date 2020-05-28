package com.abhisek.gateway.repository;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class CardDetails {
	@Id
    @GeneratedValue
    private int id;
    private String token;
    private String maskedCardNumber ;
    private String cardType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
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
	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardDetails(int id, String token, String maskedCardNumber, String cardType) {
		super();
		this.id = id;
		this.token = token;
		this.maskedCardNumber = maskedCardNumber;
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CardDetails [id=" + id + ", token=" + token + ", maskedCardNumber=" + maskedCardNumber + ", cardType="
				+ cardType + "]";
	}
    
    

}
