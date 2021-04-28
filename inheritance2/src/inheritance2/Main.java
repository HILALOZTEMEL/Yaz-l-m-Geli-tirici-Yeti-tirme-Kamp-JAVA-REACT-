package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DataBaseLogger());
		//parantezin içine ister FileLogger ister EmailLogger yazılabilir flex 
	}

}
