import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.EDevletServiceAdapter;
import Concrete.CampaingCustomerManager;
import Concrete.MembersCustomerManager;
import Concrete.SalesCustomerManager;
import Entities.Customer;



public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new MembersCustomerManager(new EDevletServiceAdapter());
		baseCustomerManager.add(new Customer(1,"hilal","öztemel",new Date(2001),"15302021486" ));
		
	   
		

	}

}
