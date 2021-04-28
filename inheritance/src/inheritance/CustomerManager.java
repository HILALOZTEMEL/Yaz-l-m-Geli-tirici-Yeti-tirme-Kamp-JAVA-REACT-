package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" Kaydedildi");
		
	}
	//bulk insert
	public void addMultiple(Customer[] customers) {
		//�oklu ekleme yap�ld��� i�in arrayler kulland�k,toplu bilgi g�ndeme mesela
	//m�steri arrayi gelcek onlar� ekle bunun i�in for
		for(Customer customer:customers) {
			//Customer t�r�nde her bir customer i�in yukar�dak� add i �al��t�r
			add(customer);
		}
		
	}


}
