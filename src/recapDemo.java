

import java.nio.file.FileSystemNotFoundException;

public class recapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 30;
		int enBuyuk = 0;
		
		if(sayi1>sayi2 && sayi1>sayi3)
		{
			enBuyuk = sayi1;
		}else if (sayi2>sayi1 && sayi2>sayi3) {
			enBuyuk = sayi2;
		}else {
			enBuyuk = sayi3;
		}
		System.out.println("En buyuk Sayi  = "+enBuyuk);
	}
}
