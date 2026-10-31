import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
	    	int N = p.nextInt();
    		int a = 0;
        for (int i = 1; i <= N; i++) {
     			a += i;
		    }
     		System.out.print(a);
    }
}
