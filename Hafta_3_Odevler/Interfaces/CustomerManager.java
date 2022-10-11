package Interfaces;

public class CustomerManager {
	
	private ICustomerDal _customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this._customerDal = customerDal;
	}
	
	public void add() {
		// İş Kodları yazılır.
		_customerDal.add();
		
	}

}
