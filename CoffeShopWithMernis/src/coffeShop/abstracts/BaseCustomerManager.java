package coffeShop.abstracts;

import coffeShop.entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
	}

}
