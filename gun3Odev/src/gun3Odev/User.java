package gun3Odev;

public class User {
	
	int id;
	String name;
	String lastName;
	
	public String fullName;
	
	public User(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return fullName=this.name+" "+this.lastName;
	}
	
	
	
}
