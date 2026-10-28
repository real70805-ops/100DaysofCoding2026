import java.util.Scanner;

public class Loop {
	
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
		int a = p.nextInt();
		
        for (int i = a; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i);	
			}
		}
		System.out.println();
        for (int j = a; j >= 1; j--) {
			if (j % 2 != 0) {
				System.out.print(j);	
			}
		}
    }
}
