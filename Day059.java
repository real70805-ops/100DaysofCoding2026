import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
		int m = p.nextInt();
		int N = p.nextInt();
        for (int i = 1; i <= N; i++) {
			    if (i % m == 0) {
   				System.out.print(i);	
		 	    }
	    	}
		
    }
}
