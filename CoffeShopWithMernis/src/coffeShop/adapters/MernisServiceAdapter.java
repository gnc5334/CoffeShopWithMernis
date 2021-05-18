package coffeShop.adapters;

import java.rmi.RemoteException;

import coffeShop.abstracts.CustomerCheckService;
import coffeShop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		boolean result;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			result = false;
			e.printStackTrace();
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		
		return result;
	}

}
