import java.util.Scanner;
public class Contoh {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 0;
		int a = 0;

		while (true) {
			n = s.nextInt();
			if (n < 0) {
				break;
			}
			a += n;
		}
		
		System.out.print(a);
		
	 }
}
