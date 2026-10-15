import java.util.Scanner;
class Contoh {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		if (a >= 85 && a <= 100) {
			System.out.println("Grade nilai A");
		}
		else if (a >= 75 && a < 85) {
			System.out.println("Grade nilai B");
		}
		else if (a >= 65 && a < 75) {
			System.out.println("Grade nilai C");
		}
		else if (a >= 55 && a < 65) {
			System.out.println("Grade nilai D");
		}
		else if (a < 55) {
			System.out.println("Grade nilai E");
		}
		else {
			System.out.print("Nilai terlalu tinggi!");
		}
	}
}
