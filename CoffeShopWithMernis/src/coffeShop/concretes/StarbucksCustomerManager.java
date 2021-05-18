package coffeShop.concretes;

import coffeShop.abstracts.BaseCustomerManager;
import coffeShop.abstracts.CustomerCheckService;
import coffeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this._customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a Valid Person");
		}
		
	}

}
