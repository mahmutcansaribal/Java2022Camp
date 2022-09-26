package RecapDemo;

public class DortIslem {
	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public int Cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	public int Carpma(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	public int Bol(int sayi1, int sayi2) {
		if(sayi1 == 0 || sayi2 == 0) {
			System.out.println("Pay veya Payda 0 olamaz");
		}
		return sayi1 / sayi2;
	}
}
