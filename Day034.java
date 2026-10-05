import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("=== RESTORAN SUB DAENG FIKI ===");
        int a2,b,c;
        String a;
        System.out.print("Jumlah porsi : ");
        a = i.nextLine();
        a2 = Integer.parseInt(""+a.charAt(0));
        System.out.print("Total Kotor  : Rp ");
        b = i.nextInt();
        System.out.print("Total Bersih : Rp ");
        c = i.nextInt();
        System.out.println("----------------------");

        if (b >= 100000 && c < 85000 || a2 >= 5) {
            System.out.print("Status Promo : SELAMAT! anda mendapatkan SUPER PROMO (DISKON 40%)");
        }
        else if (c >= 60000) {
            System.out.print("Status Promo : SELAMAT! anda mendapatkan PROMO REGULER (DISKON 15%)");
        }
        else {
            System.out.print("Status Promo : TIDAK DAPAT DISKON (DISKON 0%)");
        }
    }
}
