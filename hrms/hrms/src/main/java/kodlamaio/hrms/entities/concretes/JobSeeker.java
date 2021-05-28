package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="JobSeeker")
public class JobSeeker {
	@Id
	@GeneratedValue
	@Column(name="UserId")
	private int userId;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="TcNo")
	private String tcNo;
	@Column(name="YearOfBirthday")
	private Date yearOfBirthday;
	
	public JobSeeker() {
		super();
	}

	public JobSeeker(int userId, String firstName, String lastName, String tcNo, Date yearOfBirthday) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
		this.yearOfBirthday = yearOfBirthday;
	}
}
