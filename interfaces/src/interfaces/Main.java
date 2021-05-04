package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[]loggers= {new SmsLogger(),new DatabaseLogger() ,new FileLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer engin=new Customer(1,"engin","Demiroð");
		customerManager.add(engin);
		
		

	}

}
