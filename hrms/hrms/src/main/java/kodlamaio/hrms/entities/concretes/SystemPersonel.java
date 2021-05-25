package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="SystemPersonnel")
public class SystemPersonel {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Departman")
	private String departman;
	
	public SystemPersonel() {
		super();
	}
	
	
	public SystemPersonel(int id, String departman) {
		super();
		this.id = id;
		this.departman = departman;
	}

	


}
