import java.util.Scanner;
import java.util.Arrays;
public class soal7 {
	public static void main(String[] tri) {
		Scanner s = new Scanner(System.in);
		int[] a = {1,2,4,3,5,6};

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		System.out.println("\n");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
 		}
		
		System.out.println("\n");

		int[] b = Arrays.copyOf(a, 7);

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}

		System.out.println("\n");

		int[] c = Arrays.copyOf(b, 5);

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		System.out.println("\n");
		
			int cari = s.nextInt();
		for (int i = 0; i < c.length; i++) {
			System.out.print((cari == c[i])? c[i] + " di index " + i: "Tidak ditemukan"); break;
		}

		System.out.println("\n");

		Arrays.sort(c);
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
 	}
}