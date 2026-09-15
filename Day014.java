import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      Scanner i = new Scanner(System.in);
      System. out.print("masukkan nilai a = ");
      int a = i.nextInt();
      
      System.out.print("masukkan nilai b = ");
      int b = i.nextInt();
      
      int c = a + b;

      System.out.println("====================");
      
      System.out.println("nilai a tambah b = " + c);
      
      c = a - b;
      
      System.out.println("nilai a kurang b = " + c);
    }
}
