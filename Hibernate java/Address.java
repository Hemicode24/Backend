package com.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable	//value object, it's not an entity object.Value object means does not have real meaning of self individuality
public class Address {

	@Column(name="address_line")	//setting column name
	private String addrLine;
	
	@Column(name="street_name")
	private String street;
	
	private String city,state,country,pincode;

	public String getAddrLine() {
		return addrLine;
	}

	public void setAddrLine(String addrLine) {
		this.addrLine = addrLine;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addrLine=" + addrLine + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
}
