package com.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="Employee1")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private int empId;
	
	private String empName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@CollectionOfElements		//list of addresses
	@JoinTable(name="emp_address",joinColumns = @JoinColumn(name="empId")) //assigning table name and join column
	@GenericGenerator(strategy = "hilo", name="hilo-gen")
	@CollectionId(columns = {@Column(name="address_id")},type = @Type(type = "long"),generator = "hilo-gen")
	private Collection<Address> addresses  = new ArrayList<Address>();

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phoneNumber=" + phoneNumber + ", addresses="
				+ addresses + "]";
	}
	
	
}

















