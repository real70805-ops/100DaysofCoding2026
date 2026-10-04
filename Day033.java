import java.util.Scanner;

public class belajar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi alas (meter): ");
        double a = in.nextDouble();
        System.out.print("Masukkan tinggi limas (meter): ");
        double b = in.nextDouble(), c = ((1 * a * a) / 3 * b);

        double a2 = a * a;
        String e;

        if (c > 5000) e = "Skala Monumen Nasional";
        else if (c > 1000) e = "Skala Monumen Kota";
        else e = "Skala Monumen Taman";

        System.out.printf("""
                --- SPESIFIKASI MONUMEN ---
                Luas Alas Monumen : %.1f m2
                Volume Munumen     : %.1f m3
                Kategori Skala     : %s
                """, a2, c, e);
    }
}
