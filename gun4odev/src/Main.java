



import java.util.Date;

import gun4odev.Abstact.BaseCustomerManager;
import gun4odev.Concrete.NeroCustomerManager;
import gun4odev.Entities.Customer;

public class Main {
	
	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager= new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1,"Hilal","Öztemel",new Date(2001, 6, 12),"123456789" ));
		
		

	}

}
