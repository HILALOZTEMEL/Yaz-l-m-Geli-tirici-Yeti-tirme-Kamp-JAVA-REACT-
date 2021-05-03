package gun4odev.Concrete;



import gun4odev.Abstact.BaseCustomerManager;
import gun4odev.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService _customerCheckService;//dependes injection y�ntemi ile initialize edersek 
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		_customerCheckService=customerCheckService;
	}
	
	
	@Override
	public void save(Customer customer)  {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
			
		}else  {
			
			System.out.println("Not a valid person");
		}
		
		
		
	}

	/* 
	 * private void CheckIfRealPerson(Customer customer) {
	 
		//Starbucks mernis do�rulamas� istiyor ancak yar�n bir g�n ya neroda b�yle bir do�rulama ister ise diye person interface ini olu�tururuz	
		 * bu metoda gerek kalmaz bu durumda bunu sileriz.	
	}*/
      

}
