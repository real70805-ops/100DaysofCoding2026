import java.util.Scanner;
public class latihan {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
			System.out.print("masukkan panjang sisi persegi: ");
			int a = i.nextInt();
			
			int b = a * a;
			System.out.println("luas nya = " + b);
	}
}
