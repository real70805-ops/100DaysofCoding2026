import java.util.Scanner;
public class latihan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("=== REIGISTRASI AKUN ===");
		
		boolean b = true;
		String username = "";
		while (b)  {
			if (b) {
			System.out.print("\nUseername\t: ");
				username = s.nextLine();
			System.out.println("Panjang\t\t: " + username.length());
			}
			
			if (username.length() < 5 || username.isEmpty()) {
				System.out.println("Panjang username minimal 5! atau kosong");
			} else {
				break;
			}
		}
		
		String password = "";
		String konfirmasi = "";
		
		while (b) {
			if (b) {
				System.out.print("Password\t: ");
					password = s.next();
				System.out.print("Komfirmasi\t: ");
					konfirmasi = s.next();
			}
				
			if (password.length() < 8 || !password.equals(konfirmasi)) {
				System.out.println("Panjang password harus minimal 8 atau tidak sesuai konfirmasi!");
			} else {
				username.toLowerCase();
				username.trim();
					break;
			}
		}
		
		System.out.println("\nREIGISTRASI BERHASIL!");
		
	}
}