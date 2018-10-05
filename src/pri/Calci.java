package pri;

import java.io.*;

public class Calci {

	public static void main(String args[]) throws IOException {
		int num1, num2;
		int num3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("press 1 to add /n 2 to sub/n 3 to div /n 4 to mul");
			System.out.println("enter choice");
			int ch = Integer.parseInt(br.readLine());
			System.out.println("enter number");
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
			switch (ch) {
			case 1:
				num3 = num1 + num2;
				System.out.println("sum of" + num3);
				break;
			case 2:
				num3 = num1 - num2;
				System.out.println("sub of" + num3);
				break;
			case 3:
				num3 = num1 / num2;
				System.out.println(num3);
				break;
			case 4:
				num3 = num1 * num2;
				System.out.println("mu off" + num3);
				break;
			}
			System.out.println("enter 'y' to stop ");
			char s = br.readLine().charAt(0);
			

			if (s == 'e') {
				System.exit(0);
			}
		}

	}

}
