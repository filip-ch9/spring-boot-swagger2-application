package com.swagger.practice.demo.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "street_address")
	private String streetAdress;
	
	@Column(name = "zip_code")
	private int zipCode;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "city")
	private String city;
	
	public Contact() {}

	public Contact(String fullName, String phoneNumber, String streetAdress, int zipCode, String country, String city) {
		super();
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.streetAdress = streetAdress;
		this.zipCode = zipCode;
		this.country = country;
		this.city = city;
	}
	
}
