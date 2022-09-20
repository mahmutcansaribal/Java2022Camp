
public class sesliHarfler {

	public static void main(String[] args) {
		
		char harf = 'İ';
		char [] Kalinharfler = {'A','I','O','U'};
		char [] inceHarfler = {'E','İ','O','Ü'};
		boolean kontrol = true;
		
		for(int i = 0; i<4;i++) {
			if(harf == Kalinharfler[i]) {
				kontrol = true;
				break;
			}else if(harf == inceHarfler[i]){
				kontrol = false;
				break;
			}else {
				System.out.println("Gecersiz Harf");
				return;
			}
		}
		if(kontrol) {
			System.out.println(harf+" -> Harf kalin harftir!");
		}else {
			System.out.println(harf+" -> Harf ince harftir!");
		}
	}

}
