public class Classes {

	public static void main(String[] args) {
		
		//CustomerManager sinifindan yeni bir nesne yarattık.
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//Value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		//Diziler referans tiptir. Bu yüzden sayilar1'in adresi sayilar2 ye atandı. artık sayılar2'de
		//sayılar 1'in adresini gostermektedir
		int [] sayilar1 = new int[] {1,2,3}; 
		int [] sayilar2 = new int[] {4,5,6}; 
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		System.out.println("---------");
		for(int sayilar : sayilar2) {
			System.out.println(sayilar);
		}
		
	}

}

