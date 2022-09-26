package ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
	
		Product product = new Product(1, "Laptop", "Dizüstü", 5000, 3, "Yesil");
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		

	}

}
