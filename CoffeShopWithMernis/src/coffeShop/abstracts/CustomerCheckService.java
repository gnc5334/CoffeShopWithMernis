package coffeShop.abstracts;

import coffeShop.entities.Customer;

public interface CustomerCheckService {

	Boolean CheckIfRealPerson(Customer customer);
	
}
