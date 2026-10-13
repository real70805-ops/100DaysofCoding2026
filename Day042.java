import java.util.Scanner;

public class gajiBersih {
    public static void main (String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Gaji pokok: ");
        double a = i.nextDouble();
        System.out.print("Tunjangan: ");
        double b = i.nextDouble();

        double c = a + b;
        double d = 0;
        String g = "6";

        if (c > 5000000) {
            g = "(10%)";
            d = 0.1;
        } else {
            g = "(10%)";
            d = 0.05;
        }

        double e = c * d;
        double f = c - e;

        System.out.printf("""
=== PERHITUNGAN GAJI BERSIH ===
Gaji Pokok : Rp%.1f
Tunjangan  : Rp%.1f
------------------------------
Gaji Kotor : Rp%.1f
Potongan Pajak%s: Rp%.1f
------------------------------
Gaji Bersih : Rp%.1f
""",a,b,c,g,e,f);
    }
}
