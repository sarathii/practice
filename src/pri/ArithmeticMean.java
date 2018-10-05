package pri;

import java.util.Scanner;

public class ArithmeticMean {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("how many num to perform");
		int tot = s.nextInt();
		int sum=0;
		int inp[]=new int[tot];
		for (int i = 0; i < tot; i++) {
		inp[i]=s.nextInt();
		sum=sum+inp[i];

		
		
		
		
		
		}
		int am=sum/tot;
		System.out.println(am);

	}
}
