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
				if (password.length() < 8) {
					System.out.println("karakter password minimal 8!");
				} else {
					System.out.print("Konfirmasi\t: ");
						konfirmasi = s.next();
						if (!password.equals(konfirmasi)) {
							System.out.println("konfirmasi tidak sesuai!");
						} else {
							username.toLowerCase();
							username.trim();
								break;
						}
				}
			}
		}
		
		System.out.println("\nREIGISTRASI BERHASIL!\n");


		System.out.println("=== LOGIN DENGAN AKUN ANDA ===\n");

		String username2 = "";
		String password2 = "";
		while (b) {
			System.out.print("Masukkan username anda\t: ");
				username2 = s.next();
			System.out.print("Masukkan password anda\t: ");
				password2 = s.next();
			if (username.equals(username2) && password.equals(password2)) {
				System.out.println("\n=== LOGIN BERHASIL ===");
					break;
			} else {
				System.out.println("username atau password tidak sesuai!");
			}
		}
	}
}