package gun3Odev;

public class Main {

	public static void main(String[] args) {
		Student student=new Student(1,"Hilal","�ztemel");
		student.setSingedcourse("Java");
		Instructor �nstructor=new Instructor(1,"Buse","�ztemel");
		�nstructor.setLectureName("C#");
		
		
		UI u�=new UI();
		u�.add(new StudentManager());
		

	}

}
