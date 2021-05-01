package gun3Odev;

public class Main {

	public static void main(String[] args) {
		Student student=new Student(1,"Hilal","Öztemel");
		student.setSingedcourse("Java");
		Instructor ýnstructor=new Instructor(1,"Buse","Öztemel");
		ýnstructor.setLectureName("C#");
		
		
		UI uý=new UI();
		uý.add(new StudentManager());
		

	}

}
