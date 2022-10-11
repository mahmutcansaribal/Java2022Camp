package core.logging;

public class MSSql implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mssql eklendi "+data);
		
	}

}
