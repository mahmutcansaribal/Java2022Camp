
public class mukemmelSayi {
		// MAHMUT CAN SARIBAL
	public static void main(String[] args) {
	   int number = 14;
	   int toplam = 0;
	   
	   for(int i = 1; i < number ; i++) {
		   if(number % i == 0) {
			   toplam = toplam + i;
		   }
	   }
	   if(number == toplam) {
		   System.out.println(number+" -> Sayisi Mukemmel Sayidir!");
	   }else {
		   System.out.println(number+" -> Sayisi Mukemmel Sayi Degildir!");
	   }
	}

}
