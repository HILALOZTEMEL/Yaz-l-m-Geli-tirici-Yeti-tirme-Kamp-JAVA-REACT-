package gun5odev.core;

import gun5odev.GoogleLogger;

public class GoogleLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		
		GoogleLogger googleLogger=new GoogleLogger();
		googleLogger.googleLogin(message);
	}

	

}
