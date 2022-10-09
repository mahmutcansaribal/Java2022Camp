package Classes;

public class CustomerManager {
	
	private Customer _customer;
	ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save() {
		System.out.println("Musteri Kaydedildi\n");

	}
	public void Delete() {
		System.out.println("Musteri Silindi");
		
	}
	
	//Interface'ler referans tiplerdir.
	public void GiveCredit() {
		
		_creditManager.Calculate();
		System.out.println("Kredi Verildi");
	}
}
