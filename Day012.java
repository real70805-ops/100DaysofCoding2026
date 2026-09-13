import java.util.Scanner;  // untuk mengimport dari library java.util untuk memgenali fungsi scanner
public class PengenalanString {
    public static void main(String[] args) {
      // mendeklarasikan variable
      String nama;
      int umur;
      double tinggi;
      
      // baris dibawah ini berfungsi untuk membuat objek input baru yang bertugas membaca data yang dimasukkan oleh pengguna melalui keyboard.
      Scanner input = new Scanner(System.in); 
      
     // menampilkan teks petunjuk di layar
      System.out.print("Masukkan nama kamu = ");
      //mengambil teks yang diketik pengguna lalu menyimpannya ke variabel nama.
      nama = input.nextLine();

      // menampilkan teks petunjuk di layar
      System.out.print("Masukkan umur kamu = ");
      //mengambil teks yang diketik pengguna lalu menyimpannya ke variabel nama.
      umur = input.nextInt();

      // menampilkan teks petunjuk di layar
      System.out.print("Masukkan tinggi kamu = ");
      //mengambil teks yang diketik pengguna lalu menyimpannya ke variabel nama.
      tinggi = input.nextDouble();



      System.out.println("==============="); // untuk menampilkan garis di terminal
      System.out.println("====Biodata===="); // untuk menampilkan judul biodata dengan garis
      System.out.printf("Nama\t= %s\n", nama); // untuk memanggil dan menampilkan variable nama
      System.out.printf("Umur\t= %d\n", umur); // untuk memamggil dan menampilkan variable umur
      System.out.printf("Tinggi\t= %.1f\n", tinggi); //untuk memanggil dan menampilkan variable tinggi
      System.out.println("==============="); // untuk menampilkan garis di terminal
      input.close();
    }
}
