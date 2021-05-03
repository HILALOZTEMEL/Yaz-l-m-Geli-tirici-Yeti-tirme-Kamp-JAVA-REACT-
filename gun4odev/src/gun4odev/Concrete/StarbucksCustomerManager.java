package gun4odev.Concrete;



import gun4odev.Abstact.BaseCustomerManager;
import gun4odev.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService _customerCheckService;//dependes injection yöntemi ile initialize edersek 
	
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
	 
		//Starbucks mernis doðrulamasý istiyor ancak yarýn bir gün ya neroda böyle bir doðrulama ister ise diye person interface ini oluþtururuz	
		 * bu metoda gerek kalmaz bu durumda bunu sileriz.	
	}*/
      

}
