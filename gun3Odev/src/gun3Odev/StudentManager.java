package gun3Odev;

public class StudentManager extends UserManager {
	
    @Override
	public void add() {
		System.out.println(" Kurslara eklendi");
	}
	public void delete( ) {
		System.out.println(" Kurslardan çıkatıldı");
	}
}
