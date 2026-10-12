import java.util.Scanner;
public class latihan1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("""
    === MENU RESTORAN ===
    1. Paket A - Rp25000
    2. Paket B - Rp35000
    3. Paket C - Rp45000
    """);
    System.out.print("Pilih paket: ");
    char a = in.next().charAt(0);
    System.out.print("Jumlah : ");
    double b = in.nextDouble();
    double e = 0;
    double d = 0, c = 0, f = 0;

    if (a == 'A' || a == 'a' || a == '1') {
      f = 25000;
      d = b * f;
      if (d >= 100000) {
        e = d - (d * 0.1);
        c = d - e;
      }
      else {
        c = 0;
        e = d;
      }
    }
    else if (a == 'B' || a == 'b' || a == '2') {
      f = 35000;
      d = b * f;
      if (d >= 100000) {
        e = d - (d * 0.1);
        c = d - e;

      }
      else {
        c = 0;
        e = d;
      }
    }
    else if (a == 'C' || a == 'c' || a == '3') {
      f = 45000;
      d = b * f;
      if (d >= 100000) {
        e = d - (d * 0.1);
        c = d - e;
      }
      else {
        c = 0;
        e = d;

      }
    }
    else {
      System.out.print("Paket Tidak Valid");
      return;
    }

    System.out.printf("""
    Paket \t\t: %c
    Harga \t\t: Rp%.0f
    Jumlah\t\t: %.0f
    Total \t\t: Rp%.0f
    Diskon\t\t: Rp%.0f
    Total Bayar\t: Rp%.0f
    """,a,f,b,d,c,e);
  }
}
