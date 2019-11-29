package com.hefshine.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	public Address() {
		super();
	}
	@Column(name = "city")
	private String city;
	
	@Column(name = "pin")
	private String pin;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Address(String city, String pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Person [city=" + city + ", pin=" + pin + "]";
	}
}
