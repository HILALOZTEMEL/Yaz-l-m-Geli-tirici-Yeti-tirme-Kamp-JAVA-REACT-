package interfaces;

public class Utils {
	//s�kl�kla kullan�lan yap�lar� tekrarl� olarak yazmamak i�in bu yap� kullan�l�r.
	public static void RunLoggers(Logger[] loggers,String message) {
		
		for(Logger logger:loggers) {
			logger.log(message);
		}
		
	}
}
