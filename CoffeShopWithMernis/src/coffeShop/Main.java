package coffeShop;

import java.time.LocalDate;

import coffeShop.abstracts.BaseCustomerManager;
import coffeShop.adapters.MernisServiceAdapter;
import coffeShop.concretes.NeroCustomerManager;
import coffeShop.concretes.StarbucksCustomerManager;
import coffeShop.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1,"Ali","Veli",LocalDate.of(1999,2,3),"11111111111"));
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.Save(new Customer(2,"Ayþe","Kaya",LocalDate.of(1999,5,3),"38888888808"));
	}

}
