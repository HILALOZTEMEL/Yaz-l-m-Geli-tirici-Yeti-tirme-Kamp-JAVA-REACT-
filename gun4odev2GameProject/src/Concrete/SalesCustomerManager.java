package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class SalesCustomerManager extends BaseCustomerManager {
	
	@Override
	public void add(Customer customer ) {		
		
		System.out.println(customer.firstName+" "+customer.lastName+" Satýn alým gerçekleþti");		
		
	}

	@Override
	public void delete(Customer customer) {
		
		System.out.println(customer.firstName+" "+customer.lastName+"  iade gerçekleþti");
		
	}
	

	

}
