import java.util.Scanner;
public class day044 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("=== SISTEM EVALUASI DIKLAT ===");
		System.out.print("Mausukkan Nama Peserta       : ");
		String a = s.next();
		System.out.print("Masukkan Kode jalur (R/P)    : ");
		char b = s.next().charAt(0);
		System.out.print("Masukkan Nilai Akhir(0 - 100): ");
		int c = s.nextInt();
		String d = "";
		String e = "";

		if (b == 'R') {	
			if (c > 90) {
				d = "Reguler";
				e = "Sangat Memuaskan";
			}
			else if (c >= 80) {
				d = "Reguler";
				e = "Memuaskan";
			}
			else if (c < 80 && c > 0) {
				d = "Reguler";
				e = "Belum Lulus";
			}
		} 
		else if (b == 'P') {
			if (c > 90) {
				d = "Profesional";
				e = "Cumlaude";
			}
			else if (c >= 85) {
				d = "Profesional";
				e = "Sangat Baik";
			}
			else if (c <  85 && c > 0) {
				d = "Profesional";
				e = "Baik";
			}

		}
		
		System.out.printf("""
-------------------
HASIL EVALUASI PESERTA
-------------------
Nama Peserta : %s
Jenis Jalur  : %s
Nilai Akhir  : %d
Predikat     : %s
------------------
				""",a,d,c,e);
	}
}
