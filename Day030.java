import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Masukkan nilai siswa: ");
		int a = in.nextInt();
		System.out.println("Status lulus: " + (a >= 75 && a <= 100));
    }
}
