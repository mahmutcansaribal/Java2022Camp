package Overriding;

public class Main {

	public static void main(String[] args) {
		//Instance
		BaseCrediManager[] krediManagers = new BaseCrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(),new OgrenciKrediManager()};
		
		for(BaseCrediManager krediManager : krediManagers) {
			//Polymorphism.
			System.out.println(krediManager.hesapla(1000));
		}

	}

}
