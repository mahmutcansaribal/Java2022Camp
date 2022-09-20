
public class loopDemo {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10 ;i++)
		{
			System.out.println(i+". Sayi : "+i);
		}
		System.out.println("For Dongusu Sona ermistir!");
		System.out.println("--------------");
		//While
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Dongusu Bitti!");
		System.out.println("--------------");
		
		
		
		//Do-While
		/* Do-While kosul saglanmasa bile 1 defalik donguyu calistirir.*/
		int j = 100;
		do {
			System.out.println(j);
			j++;
		} while (j<10);
		
		System.out.println("Do-While Dongusu Bitti!");
		System.out.println("--------------");
	}

}
