package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" Kaydedildi");
		
	}
	//bulk insert
	public void addMultiple(Customer[] customers) {
		//çoklu ekleme yapýldýðý için arrayler kullandýk,toplu bilgi göndeme mesela
	//müsteri arrayi gelcek onlarý ekle bunun için for
		for(Customer customer:customers) {
			//Customer türünde her bir customer için yukarýdaký add i çalýþtýr
			add(customer);
		}
		
	}


}
