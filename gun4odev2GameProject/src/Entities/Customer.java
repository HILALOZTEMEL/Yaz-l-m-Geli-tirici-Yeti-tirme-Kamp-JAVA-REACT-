package Entities;

import java.util.Date;

public class Customer {
	
	public int id;
	public String firstName;
	public String lastName;
	public Date dateOfBirth;
	public String nationalityId;
	
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	
}
