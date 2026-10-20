import java.util.Scanner;

public class polaPergantianDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

		String b = (a >= 170) ? "Boleh masuk" : "Belum boleh";    
        System.out.print(b);
    }
}
