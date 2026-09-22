import java.util.Scanner;
public class untitled {
	
	public static void main (String[] args) {
		Scanner i = new Scanner(System.in);
		 System.out.print("Nama Mahasiswa: ");
		 String a = i.nextLine();
		 System.out.print("Nilai ujian: ");
		 String b = i.nextLine();
		 System.out.print("Status kelulusan: ");
		 String c = i.nextLine();
		 
		 double d = Double.parseDouble(b);
		 boolean e = Boolean.parseBoolean(c);
		 double f = d + 5;
		 
		 System.out.println("===LAPORAN NILAI MAHAASISWA===");
		 System.out.println("Nama Mahasiswa\t: " + a);
		 System.out.println("Nilai Akhir\t: " + f);
		 System.out.println("Status Lulus\t: " + e);
  }
}
