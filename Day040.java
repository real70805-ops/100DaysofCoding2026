

import java.util.Scanner;
public class RangkaianDigitNaikTerpanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		 System.out.println("""
			 1. Reguler - Rp40000
			 2. SweetBox - Rp60000
			 3. VIP - Rp90000
							""");
		System.out.print("Pilih kategori (1-3): ");
		double a = input.nextDouble();
		System.out.print("Jumlah tiket:  ");
		double b = input.nextDouble();
		double c = 0;
	 	double d = 0;
		String e = "";
		double f = 0;
		double g = 0;
		
		if (a == 1) {
			f = 40000;
			e = "Reguler";
			c = b * f;
			if (c >= 150000) {
				d = c * 0.15;
				g = c - d;
			}
			else {
				g = c;
			}
		}
		else if (a == 2) {
			f = 60000;
			e = "SweetBox";
			c = b * f;
			if (c >= 150000) {
				d = c * 0.15;
				g = c - d;
			}
			else {
				g = c;
			}
		}
		else if (a == 3) {
			f = 90000;
			e = "VIP";
			c = b * f;
			if (c >= 150000) {
				d = c * 0.15;
				g = c - d;
			}
			else {
				g = c;
			}
		}
		else {
			System.out.print("Input Tidak Valid!");
			return;
		}

		System.out.printf("""	
						  kategori   \t: %s
						  Harga      \t: Rp%.0f
						  Jumlah     \t: %.0f
						  Total      \t: Rp%.0f
						  Diskon     \t: Rp%.0f
						  Total Bayar\t: Rp%.0f
						  """,e,f,b,c,d,g);
		
    }
}
