package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
	//Müþteri ekleme Kodlarý	
		System.out.println("Müþteri eklendi");
		logger.log();
		//Logger türünde logger geldiðinde oraya git içerisindeki log metodunu çalýþtýr.
	}
}
