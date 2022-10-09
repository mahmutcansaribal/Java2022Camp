package Classes;

public abstract class BaseCreditManager implements ICreditManager{
	//Caculate methodu Ortak degil her yerde degisken.
	public abstract void Calculate();
	// Ortak bir method.
	public void Save() {
		System.out.println("Kaydedildi");
	}
	
}
