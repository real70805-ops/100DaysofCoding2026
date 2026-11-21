import java.util.Scanner;

public class LatihanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[5];

        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
			if (i == data.length-1)	{
				for (int j = 0; j < data.length; j++) {
					System.out.print(data[j] + " ");
				}
			}  
        }

    }
}