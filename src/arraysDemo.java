
public class arraysDemo {

	public static void main(String[] args) {
		
		// Kaç Elemandan olusacaksa onu yazdik!
		String [] ogrenciler = new String[4]; 
		
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Can";
		ogrenciler[3] = "Furkan";
		
		for(int i = 0;i<ogrenciler.length;i++)
		{
			System.out.println((i+1)+". Ogrenci : "+ogrenciler[i]);
		}
		// Genel Kullanım boyledir!
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
