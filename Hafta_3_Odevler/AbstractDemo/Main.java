package AbstractDemo;

public class Main {
	
	public static void name() {
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new OracleDatabaseManager();
		customerManager.getCustomer();
	}
}
