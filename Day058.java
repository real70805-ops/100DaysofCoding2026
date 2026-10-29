import java.util.Scanner;

public class Loop {
	
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
		int a = p.nextInt();
		
        for (int i = 1; i <= a; i++) {
			     if (i % 2 == 0) {
				   System.out.print(i);	
		     	}
	    	}
      
		System.out.println();
        for (int j = 1; j <= a; j++) {
	    		if (j % 2 != 0) {
	  			System.out.print(j);	
    			}
		   }
    }
}
