package nLayeredDemo.core;

import nLayeredDemo.jLogger.JloggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String Message) {
		JloggerManager manager=new JloggerManager();
		manager.log(Message);
		
	}

}
