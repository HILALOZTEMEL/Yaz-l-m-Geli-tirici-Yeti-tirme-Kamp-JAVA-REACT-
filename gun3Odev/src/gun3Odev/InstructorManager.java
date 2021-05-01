package gun3Odev;

public class InstructorManager extends UserManager{
	
	@Override
	public void add() {		
		System.out.println(" kursa eðitmen olarak atandýnýz");
	}
	public void delete() {
		System.out.println(" artýk bu kursun eðitmeni deðilsiniz");
	}
}
