package Classes;

public class CarCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("Arac Kredisi Verildi.");
		
	}

	@Override
	public void Save() {
		System.out.println("Kaydedildi");
		
	}

}
