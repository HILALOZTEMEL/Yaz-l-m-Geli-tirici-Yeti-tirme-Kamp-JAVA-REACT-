package Abstract;
import Entities.Customer;

public abstract class  BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.firstName+" "+customer.lastName+" �ye Kaydedildi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.firstName+" "+customer.lastName+" �ye silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.firstName+" "+customer.lastName+" �ye bilgileri g�ncellendi");
		
	}
	
}
