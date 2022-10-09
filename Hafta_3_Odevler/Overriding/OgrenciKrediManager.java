package Overriding;

public class OgrenciKrediManager extends BaseCrediManager{
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
