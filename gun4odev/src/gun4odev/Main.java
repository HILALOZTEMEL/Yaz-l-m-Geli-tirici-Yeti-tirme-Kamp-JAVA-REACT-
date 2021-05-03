package gun4odev;




import java.rmi.RemoteException;
import java.util.Date;
import java.util.GregorianCalendar;

import Adapters.MernisServiceAdapter;
import gun4odev.Abstact.BaseCustomerManager;
import gun4odev.Concrete.CustomerCheckService;
import gun4odev.Concrete.NeroCustomerManager;
import gun4odev.Concrete.StarbucksCustomerManager;
import gun4odev.Entities.Customer;

public class Main {
	
	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"hilal","öztemel",new Date(2001),"123456987" ));
		
		

	}

}
