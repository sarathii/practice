package pri;

import java.util.*;

public class ReveseNum {
	public static void main(String args[]) {
		int num;
		
		while (true) {
			
			System.out.println("enter number");
			Scanner s = new Scanner(System.in);
			num = s.nextInt();
			
			int org = num;
			int rem, rev = 0;
			while (num > 0) {
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			if (org == rev) {
				System.out.println("same");
			} else {
				System.out.println("nopee....");
			}
			System.out.print("want to conntinue if YES press 'y'or press 'n");
			char ch=s.next().charAt(0);
		if(ch=='n')
		{
			System.exit(0);
		}
		}
		

	}

}
