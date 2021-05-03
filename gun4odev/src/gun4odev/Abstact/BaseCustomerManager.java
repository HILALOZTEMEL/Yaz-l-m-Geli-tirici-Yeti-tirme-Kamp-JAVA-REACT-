package gun4odev.Abstact;
/*Bu bir abstract týr. 
nero ve starbucs ikiside save iþlemi yapar.ikisininde ortak kodu var 
o nedenle biz CustomerServise interfacesini ayrý ayrý her iki class a implente edip,
o classlerda @Override edilen metotlarý ayrý ayrý doldurmak yerine,
CustomerServise interfacesini BaseCustomerManager a implemente edip,
içini doldurup,BaseCustomerManager ý her ikisine extends edersem ,
dolaylý yoldan interfece deki save metodunu miras almýþ olurum */

import gun4odev.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to DB "+customer.firstName);
		
	}
	

}
