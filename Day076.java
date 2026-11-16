import java.util.Scanner;
public class latihan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = " saya suka java    ";

		System.out.println(a.substring(1, 5));
		System.out.println(a.replace("suka" , "damn"));
		System.out.println(a.trim());
		
	}
}