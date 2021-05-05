package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class SalesCustomerManager extends BaseCustomerManager {
	
	@Override
	public void add(Customer customer ) {		
		
		System.out.println(customer.firstName+" "+customer.lastName+" Sat�n al�m ger�ekle�ti");		
		
	}

	@Override
	public void delete(Customer customer) {
		
		System.out.println(customer.firstName+" "+customer.lastName+"  iade ger�ekle�ti");
		
	}
	

	

}
