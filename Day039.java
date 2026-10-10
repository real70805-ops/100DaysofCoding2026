import java.util.Scanner;
public class JarakAngkaTerbesar {
    public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		int b = i.nextInt();
		char c = i.next().charAt(0);

		if (c == 'x') {
			System.out.print(a * b);
		}
		else if (c == ':') {
			if (b != 0) {
				System.out.print(a / b);
			}
			else {
				System.out.print("nggak bisa dibagi 0 woi!");
			}
		}
		else if (c == '+') {
			System.out.print(a + b);
		}
		else if (c == '-') {
			System.out.print(a - b);
		}
		else if (c == '%') {
			System.out.print(a % b);
		}
		else {
			System.out.print("Operator Tidak Valid!");
		}
      
    }
}
