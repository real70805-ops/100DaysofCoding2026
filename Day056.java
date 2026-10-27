import java.util.Scanner;

public class day56 {
   public static void main(String[] args) {
    Scanner q= new Scanner(System.in);
    int n= q.nextInt();

    for (int i = 1; i<=n; i++) {
      System.out.print(i+", ");
    }

    System.out.println();
    for (int i = n; i >=1; i--) {
      System.out.print(i+", ");
    }
    q.close();
   } 
}
