package pri;

import java.io.*;

public class n_num {
	public static void main(String args[]) throws IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int total=0;
		n = Integer.parseInt(br.readLine());
		int sum[]=new int[n];
		for (int i = 0; i <n; i++)
		{ 
			sum[i]=Integer.parseInt(br.readLine());
			total=total+sum[i];
			
		}
		System.out.println(total);
	}
}
