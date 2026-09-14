import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Batas type data: " + Byte.MIN_VALUE + " sampai " + Byte.MAX_VALUE + " Batas type int: " + Integer.MIN_VALUE + " sampai " + Integer.MAX_VALUE);

        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nm = i.nextLine();
        System.out.print("Masukkan umur : ");
        int um = i.nextInt();
        System.out.println("Biodata Anda -> Nama: " + nm + ", Umur: " + um + " Tahun");
        i.close();
    }
}
