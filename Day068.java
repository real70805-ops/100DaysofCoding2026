import java.util.Scanner;

public class penugasan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan string n : ");
        String n = s.next();
        
        if (n.length() % 2 == 0) {
            System.out.println("Jumlah karakter   : " + n.length());
            System.out.println("Hasil bagi genap  : " + (n.length() / 2));
        } 
        else {
            System.out.println("Nilai angka       : " + n.length());
            System.out.println("Ganjil, tidak dibagi 2.");
        }
    }
}
