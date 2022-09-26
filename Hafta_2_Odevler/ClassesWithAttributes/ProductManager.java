package ClassesWithAttributes;



public class ProductManager {

	public void Add(Product product) {
		
		System.out.println("Urun Eklendi : "+product.get_name());
		System.out.println("Urun Kod : "+product.get_kod());
	}

}
