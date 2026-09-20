import java.util.Scanner;

public class slebew {
    public static void main(String[] args) {
      Scanner i = new Scanner(System.in);

      System.out.print("Masukkan harga: ");
      int hAw = i.nextInt();
      System.out.print("Masukkan diskon: ");
      double dis = i.nextDouble();
      
      double hSD = hAw - (dis / 100 * hAw);
      int hAk = (int) hSD;
      
      System.out.println("\nHarga awal\t\t: " + hAw);
      System.out.println("Harga setelah diskon : " + hSD);
      System.out.println("Harga akhir\t\t: " + hAk);
    }
} 
