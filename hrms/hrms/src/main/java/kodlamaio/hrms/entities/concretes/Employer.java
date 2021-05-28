package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employer")
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="UserId")
	private int userId;
	@Column(name="CompanyName")
	private String companyName;
	@Column(name="WebsiteAdress")
	private String websiteAdress;
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	public Employer() {
		super();
	}
	
	public Employer(int userId, String companyName, String websiteAdress, String phoneNumber) {
		super();
		this.userId = userId;
		this.companyName = companyName;
		this.websiteAdress = websiteAdress;
		this.phoneNumber = phoneNumber;
	}

}
