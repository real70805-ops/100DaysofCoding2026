import java.util.Scanner;

public class CekBilanganPrima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int a = 1;
		for (int i = 1; i <= N; i++) {
			a *=i;
		}
		System.out.print(a);
        s.close();
    }
}
