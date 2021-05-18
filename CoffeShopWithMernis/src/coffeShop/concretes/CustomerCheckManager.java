package coffeShop.concretes;

import coffeShop.abstracts.CustomerCheckService;
import coffeShop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		return true;
	}



}
