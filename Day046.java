import java.util.Scanner;

public class day046 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("=== SELAMAT DATANG DI KANTIN DELICIOUS ===");
		System.out.print("Masukkan Nama Pemesan : ");
		String nM = s.nextLine();
		System.out.print("""
Pilih Kategori Menu:
[M]Makanan
[D]Minuman
""");
		System.out.print("Maskkan Pilihan Anda (M/D): ");
		char kM = s.next().charAt(0);
		String mD = "";
		double hM = 0;
		double pM = 0;
		double jP = 0;

		switch (kM) {
			case 'M':
			System.out.print("""
\n\t\t--- MENU MAKANAN ---
1. Nasi Goreng Spesial- Rp 25.000
2. Ayam Bakar Madu - Rp 30.000
3. Mie Goreng Seafood - Rp 22.000
""");
			System.out.print("Masukkan nomor pilihan makanan (1-3): ");
			pM = s.nextInt();
				if (pM == 1) {
					hM = 25000;
					mD = "Nasi Goreng Spesial";
				}
				else if (pM == 2) {
					hM = 30000;
					mD = "Ayam Bakar Madu";
				}
				else if (pM == 3) {
					hM = 22000;
					mD = "Mie Goreng Seafood";
				}
			System.out.print("Masukkan jumlah porsi: ");
			jP = s.nextInt();
		System.out.println("==========================================");
			break;
			case 'D':
			System.out.print("""
\n\t\t--- MENU MAKANAN ---
1. ES Teh Manis - Rp 5.000
2. Jus Jeruk Segar - Rp 10.000
3. Air Mineral - Rp 4.000
""");
			System.out.print("Masukkan nomor pilihan minuman (1-3): ");
			pM = s.nextInt();
				if (pM == 1) {
					hM = 5000;
					mD = "Es Teh Manis";
				}
				else if (pM == 2) {
					hM = 10000;
					mD = "Jus Jeruk Segar";
				}
				else if (pM == 3) {
					hM = 4000;
					mD = "Air Mineral";
				}
			System.out.print("Masukkan jumlah porsi: ");
			jP = s.nextInt();
		System.out.println("==========================================");
			break;
		}
		
		double tH = hM * jP;

		System.out.printf("""
\n\t\t	STRUK PESANAN ANDA	
================================
Nama Pemesan\t: %s
Menu Dipilih\t: %s
HArga satuan\t: Rp %,.0f
Jumlah Prosi\t: %,.0f
--------------------------
Total Harga\t: Rp %,.0f
===============================
Terima kasih atas pesanan anda!
""",nM,mD,hM,jP,tH);

	}
}
