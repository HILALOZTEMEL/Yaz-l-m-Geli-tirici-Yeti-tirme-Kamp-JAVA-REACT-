package gun3Odev;

public class Instructor extends User{
	
	String lectureName;
	
	public Instructor(int id, String name, String lastName) {
		super(id, name, lastName);
		// TODO Auto-generated constructor stub
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	
	
}
