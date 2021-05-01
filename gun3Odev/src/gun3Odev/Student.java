package gun3Odev;

public class Student extends User{
	
	String singedcourse;	
	
	public Student(int id, String name, String lastName) {
		super(id, name, lastName);
		// TODO Auto-generated constructor stub
	}

	public String getSingedcourse() {
		return singedcourse;
	}

	public void setSingedcourse(String singedcourse) {
		this.singedcourse = singedcourse;
	}

	
}
