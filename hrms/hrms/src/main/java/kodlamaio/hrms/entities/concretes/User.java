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
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;	
	
	@Column(name="EPosta")
	private String ePosta;
	@Column(name="Password")
	private String password;
	@Column(name="PasswordRepeat")
	private String passwordRepeat;
	
	
	public User() {
		super();
	}

	public User(int id, String ePosta, String password, String passwordRepeat) {
		super();
		this.id = id;
		this.ePosta = ePosta;
		this.password = password;
		this.passwordRepeat = passwordRepeat;
	}
}
