package Adapters;

import java.rmi.RemoteException;

import Concrete.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EDevletServiceAdapter implements CustomerCheckService{
private boolean result;

	
	@Override
	public boolean checkRealPerson(Customer customer) {
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
