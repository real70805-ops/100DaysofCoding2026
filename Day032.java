import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("tot_kata: ");
		int a = in.nextInt();
		System.out.print("jum_salah: ");
		int b = in.nextInt();

		if (((40 * 5) < a) && b <= 5) System.out.print("Hasil: lolos kualifikasi");
		else System.out.print("Hasil: gagal");
    }
}
