package ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
	
		Product product = new Product();
		product.setId(1);
		product.set_name("Laptop"); 
		product.set_description("Diz Ustu Laptop");
		product.set_price(5600);
		product.set_stockAmount(3);
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		

	}

}
