package AbstractClasses;

public abstract class GameCalculator {
	// Kim inherit ediyorsa kendi kodunuz yazmak zorundadır.
	public abstract void hesapla();
	//Hic bir zaman ezilemez final keyWordu yüzünden.
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}
}
