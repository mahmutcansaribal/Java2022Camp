
public class switchDemo {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mukemmel");
			break;
		case 'B':
			System.out.println("İyi");
			break;
		case 'C':
			System.out.println("Orta");
			break;
		case 'D':
			System.out.println("Idare eder");
			break;
		case 'F':
			System.out.println("Kaldiniz");
			break;
		default:
			System.out.println("Yanlis Not Girildi!");
		}

	}

}
