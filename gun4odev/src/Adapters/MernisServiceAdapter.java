package Adapters;

import java.rmi.RemoteException;


import gun4odev.Concrete.CustomerCheckService;
import gun4odev.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

private boolean result;
	
	public Boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		try {
			this.result = client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), (int)customer.dateOfBirth.getTime());
		}
		catch (RemoteException exception){
			exception.printStackTrace();
		}
		return this.result;
	}

}
