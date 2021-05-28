package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "verification_codes")
public class EmailVerify {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "code")
	private String code;

	@Column(name = "is_verified")
	private boolean isVerified;

	@Column(name = "user_id")
	private int userId;

	public EmailVerify() {
		super();
	}

	public EmailVerify(int id, String code, boolean isVerified, int userId) {
		super();
		this.id = id;
		this.code = code;
		this.isVerified = isVerified;
		this.userId = userId;
	}
}
