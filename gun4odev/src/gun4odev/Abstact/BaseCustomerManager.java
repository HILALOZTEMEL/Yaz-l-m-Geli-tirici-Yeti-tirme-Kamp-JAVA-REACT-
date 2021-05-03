package gun4odev.Abstact;
/*Bu bir abstract t�r. 
nero ve starbucs ikiside save i�lemi yapar.ikisininde ortak kodu var 
o nedenle biz CustomerServise interfacesini ayr� ayr� her iki class a implente edip,
o classlerda @Override edilen metotlar� ayr� ayr� doldurmak yerine,
CustomerServise interfacesini BaseCustomerManager a implemente edip,
i�ini doldurup,BaseCustomerManager � her ikisine extends edersem ,
dolayl� yoldan interfece deki save metodunu miras alm�� olurum */

import gun4odev.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to DB "+customer.firstName);
		
	}
	

}
