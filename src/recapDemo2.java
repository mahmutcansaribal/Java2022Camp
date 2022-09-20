
public class recapDemo2 {

	public static void main(String[] args) {
		double[] mylist = {1.2,1.3,4.3,5.6};
		double max = mylist[0];
		double total = 0;
		
		for(double number : mylist)
		{
			if(max < number)
			{
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = "+total);
		System.out.println("En buyuk sayi = "+max);

	}

}
