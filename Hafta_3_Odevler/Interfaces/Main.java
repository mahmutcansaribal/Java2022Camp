package Interfaces;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//Bir Class birden fazla Interface'i implement edebilir.
		//Interface ler de Abstractlar gibi newlenemez.!
		//Polymorphism.
		//ICustomerDal customerDal = new OracleCustomerDal();
		//customerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new SqlCustomerDal());
		customerManager.add();
	}

}
