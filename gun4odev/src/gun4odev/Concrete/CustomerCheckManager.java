package gun4odev.Concrete;

import gun4odev.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		return true;
		
		
	}

}
