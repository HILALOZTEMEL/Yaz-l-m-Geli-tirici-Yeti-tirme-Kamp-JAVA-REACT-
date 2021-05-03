package gun4odev.Abstact;

import gun4odev.Entities.Customer;

public interface CustomerService {
	 //temel servis interfacesi
	
	//iki firmada müþterileri veri tabanýna kaydetmek istiyor ozaman imzayý yazalým
	 void save(Customer customer);//Customer sýnýfýndan 

}
