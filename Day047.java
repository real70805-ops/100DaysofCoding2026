import java.util.Scanner;

public class DAY047 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        char c = s.next().charAt(0);

        switch (c) {
            case 'x':
                a *= b;
                break;
            case ':':
                a /= b;
                break;
            case '+':
                a += b;
                break;
            case '-':
                a -= b;
                break;
            case '%':
                a %= b;
                break;
            default:
                System.out.print("Operator anda salah!!!");
                return;
        }

        System.out.print(a);

    }
}
