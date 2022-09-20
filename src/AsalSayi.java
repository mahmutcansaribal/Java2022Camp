
public class AsalSayi {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		boolean isPrime = true;

		if(number == 1)
		{
			System.out.println(number+" Sayisi asal degildir");
			return;
		}
		
		if (number < 1) {
			System.out.println("Gecersiz Sayi");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(number + " Sayisi Asaldir!");
		} else {
			System.out.println(number + " Sayisi asal degildir");
		}

	}
}
