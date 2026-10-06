import java.util.Scanner;
public class Latihan24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Piih Daya (1=900 VA, 2=1300 VA): ");
		int a = in.nextInt();
		System.out.print("Subsidi ? (1=Ya, 2=Tidak ): ");
		double b = in.nextInt();
		System.out.print("Pemakaian (kWh): ");
		double c = in.nextDouble(), d;

		if (a == 1) {
			if (b == 1) {
				d = c * 605;
				System.out.printf("""
								  --- RINCIAN TAGIHAN PLN ---
								  Daya Terminal  : 900 VA
								  Pemakaian      : %.0f kWh
								  Total Tagihan  : Rp %.1f
								  """, c, d);
			}
			else if (b == 2) {
				if (c <= 100) {
					d =c * 1352;
					System.out.printf("""
								  --- RINCIAN TAGIHAN PLN ---
								  Daya Terminal  : 900 VA
								  Pemakaian      : %.0f kWh
								  Total Tagihan  : Rp %.1f
								  """, c, d);
				}
				else if (c > 100) {
					d = c * 1444;
					System.out.printf("""
								  --- RINCIAN TAGIHAN PLN ---
								  Daya Terminal  : 900 VA
								  Pemakaian      : %.0f kWh
								  Total Tagihan  : Rp %.1f
								  """, c, d);
				}
 			}
		}
		else if (a == 2) {
			if (c > 300) {
				d = c * 1444.70;
				d = d + (d * 0.1);
				
				System.out.printf("""
								  --- RINCIAN TAGIHAN PLN ---
								  Daya Terminal  : 1300 VA
								  Pemakaian      : %.0f kWh
								  Total Tagihan  : Rp %.1f
								  """, c, d);
			}
		}
		
	
	
	 
	}
}
