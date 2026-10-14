import java.util.Scanner;
class Contoh {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		if (a % 3 == 0 && a % 5 == 0) {
			System.out.print(a + " adalah kelipatan 3 dan 5");
		}
		else if (a % 5 == 0) {
			System.out.print(a + " adalah kelipatan 5");
		}
		else if (a % 3 == 0) {
			System.out.print(a + " adalah kelipatan 3");
		}
		else {
			System.out.print(a + " bukan kelipatan 3 atau 5");
		}
	}
}
