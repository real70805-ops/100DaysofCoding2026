import java.util.Scanner;
public class Day020 {
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    int s1 = i.nextInt();
    String s2 = String.valueOf(s1);
    String s3 = s2 + s2;

    System.out.println("Hasil String : " + s3);
    System.out.println("Panjang teks : " + s3.length());
  } 
}
