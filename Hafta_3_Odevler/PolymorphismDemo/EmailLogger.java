package PolymorphismDemo;

public class EmailLogger extends BaseLogger{
	public void Log(String message) {
		System.out.println("Email Logger : "+message);
	}
}
