import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("usia: ");
		int usia = in.nextInt();
		System.out.print("isWithAdult: ");
		boolean isWithAdult = in.nextBoolean();
		
		boolean a = usia >= 17 || usia >= 13 && isWithAdult;
		
		System.out.println("Izin masuk ? " + a);
    }
}
