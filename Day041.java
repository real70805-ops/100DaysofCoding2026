import java.util.Scanner;
public class RangkaianDigitNaikTerpanjang {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
		
		System.out.print("Masukkan jari-jari taman (meter): ");
		double r = i.nextDouble();
		
		final double PI = 3.141591111111;
		double L = PI * r * r;
		double K = 2 * PI * r;
		double tAw = L * 150000;
		double Dis = 0;
		String D = "";

		if (tAw >= 50000000) {
			D = "(10%)";
			Dis = tAw * 0.1;
		}
		else if (tAw >= 20000000) {
			D = "(5%)";
			Dis = tAw * 0.05;
		}
		else {
			D = "(0)";
			Dis = 0;
		}

		double tAk = tAw - Dis;
		
		System.out.printf("""
						  --- RINCIAN BIAYA RENOVASI ---
						  Keliling Lapangan\t: %.2f m
						  Luas Lapangan\t\t: %.2f m2
						  Total Biaya Awal\t: Rp%,.2f
						  Diskon%s\t\t\t: Rp%,.2f
						  Total Biaya Akhir\t: Rp%,.2f
						  """,K,L,tAw,D,Dis,tAk);
    }
}
