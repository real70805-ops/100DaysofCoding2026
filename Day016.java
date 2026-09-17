import java.util.Scanner;
public class day14{   
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    
    System.out.print("Masukkan jam saat ini (0-23): ");
    int jam = i.nextInt();
    
    System.out.print("Berapa jam lagi acara dimulai?: ");
    int berapaJamLagi = i.nextInt();
    
    int dimulaiJam = (jam + berapaJamLagi) % 24;
    System.out.println("Acara akan dimulai pada jam: " + dimulaiJam);
      }
}
