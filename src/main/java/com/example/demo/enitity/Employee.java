package com.example.demo.enitity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employee {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String DOB;
	private String Gender;
	private String Department;
	private int Experience;
	private String MartialStatus;
	private String Address;
	private String State;
	private int Pincode;
	private String PhoneNumber;
	public int getId() {
		return id;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
//				+ ", DOB=" + DOB + ", Gender=" + Gender + ", Department=" + Department + ", Experience=" + Experience
//				+ ", MartialStatus=" + MartialStatus + ", Address=" + Address + ", State=" + State + ", Pincode="
//				+ Pincode + ", PhoneNumber=" + PhoneNumber + "]";
//	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstName, String lastName, String email, String dOB, String gender,
			String department, int experience, String martialStatus, String address, String state, int pincode,
		 String phoneNumber) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		DOB = dOB;
		Gender = gender;
		Department = department;
		Experience = experience;
		MartialStatus = martialStatus;
		Address = address;
		State = state;
		Pincode = pincode;
		PhoneNumber = phoneNumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public String getMartialStatus() {
		return MartialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		MartialStatus = martialStatus;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public  String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber( String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	

	
	

}
