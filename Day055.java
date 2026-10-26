import java.util.Scanner;
public class Contoh {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a > 0) {
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.println("kelipatan dua ");
				continue;
			}
			System.out.println(i);
		}
		}
		else {
			System.out.println("Bilangan negatif");
			return;
		}

		switch (a) {
			case 100:
				System.out.print(a + " Seratus");
				break;
			case 10:
				System.out.print(a + " Sepuluh");
				break;
			default:
				System.out.print(a + " bukan seratus atau sepuluh");
		}
		
	}
}
