import java.util.Scanner;
public class PasswordBruteForceAnimated {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
      System.out.print("Masukkan panjang : ");
      double a = i.nextInt();
      System.out.print("Masukkan luas : ");
      double b = i.nextInt();

      double c = a * b;
      double d = c / 10000;

      System.out.println("=== HASIL PERHITUNGAN ===");
      System.out.println("panjang = " + a);
      System.out.println("lebar = " + b);
      System.out.println("Luas = " + d);
    }
}
