package interfaces;

public class Utils {
	//sýklýkla kullanýlan yapýlarý tekrarlý olarak yazmamak için bu yapý kullanýlýr.
	public static void RunLoggers(Logger[] loggers,String message) {
		
		for(Logger logger:loggers) {
			logger.log(message);
		}
		
	}
}
