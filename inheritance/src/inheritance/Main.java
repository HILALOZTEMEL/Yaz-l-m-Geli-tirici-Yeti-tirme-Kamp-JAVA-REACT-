package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.customerNumber="123";
		CorporateCustomer  corporateCustomer=new CorporateCustomer();
		corporateCustomer.customerNumber="2354";
		
		CustomerManager customerManager= new CustomerManager();
		/*
		 * customerManager.add(corporateCustomer);
		 * customerManager.add(individualCustomer);
		 */
		Customer[] customers= {individualCustomer,corporateCustomer};
		
		customerManager.addMultiple(customers);
		
	}

}
