package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class MembersCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService checkService;

	public MembersCustomerManager(CustomerCheckService checkService) {
	
		this.checkService = checkService;
	}
	
	@Override
	public void add(Customer customer) {
		if(checkService.checkRealPerson(customer)) {
			super.add(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}
	
 
}
