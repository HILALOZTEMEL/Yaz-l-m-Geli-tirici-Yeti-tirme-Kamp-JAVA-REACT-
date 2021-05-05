package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class CampaingCustomerManager extends BaseCustomerManager {
	@Override
	public void add(Customer customer) {
		System.out.println("%10 kampanya eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kampanya silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("kampanya bilgileri güncellendi");
		
	}
}
