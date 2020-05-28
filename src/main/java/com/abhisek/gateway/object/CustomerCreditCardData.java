package com.abhisek.gateway.object;

import java.util.HashMap;

public class CustomerCreditCardData {

	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String phone;
	private String email;
	private String cardNumber;
	private String expirationDate;
	private String cvv2;
	private String amount;
	private String token;

	public CustomerCreditCardData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerCreditCardData(String firstName, String lastName, String address1, String address2, String city,
			String state, String zip, String country, String phone, String email, String cardNumber,
			String expirationDate, String cvv2, String amount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.cvv2 = cvv2;
		this.amount = amount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCvv2() {
		return cvv2;
	}

	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CustomerCreditCardData [firstName=" + firstName + ", lastName=" + lastName + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + ", phone=" + phone + ", email=" + email + ", cardNumber=" + cardNumber + ", expirationDate="
				+ expirationDate + ", cvv2=" + cvv2 + ", amount=" + amount + "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
