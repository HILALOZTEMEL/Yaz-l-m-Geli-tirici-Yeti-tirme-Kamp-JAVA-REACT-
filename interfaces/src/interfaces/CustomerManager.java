package interfaces;



public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi "+ customer.getFirstName());
		//Utils clasinýn Fonksiyonu static tanýmlý olduðu için kullanýmý müko
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi "+ customer.getFirstName());
		Utils.RunLoggers(loggers,customer.getFirstName());
	}
	
	

}
