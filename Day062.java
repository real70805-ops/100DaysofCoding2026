import java.util.Scanner;

public class CekBilanganPrima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = N; i >= 1; i--) {
			for (int j = N; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
    }
}
