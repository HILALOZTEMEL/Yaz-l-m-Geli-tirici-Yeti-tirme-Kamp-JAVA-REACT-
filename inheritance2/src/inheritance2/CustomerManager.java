package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
	//M��teri ekleme Kodlar�	
		System.out.println("M��teri eklendi");
		logger.log();
		//Logger t�r�nde logger geldi�inde oraya git i�erisindeki log metodunu �al��t�r.
	}
}
