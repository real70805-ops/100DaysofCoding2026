import java.util.Scanner;
public class Contoh {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("""
							 1. ayam
							 2. kambing
							 3. sapi
							 0. keluar
							 """);
			int a = s.nextInt();
			
			if (a == 1 || a == 2 || a == 3) {System.out.print("PESANAN ANDA DIPROSES!!"); break;}
			else if (a == 0) {System.out.print("TERIMA KASIH!"); break;}
			else {System.out.println("masukkan pilihan yg benah!!");}
			
		} while (true);
	 }
}
