package pri;
import java.util.*;
import java.io.*;
public class user {
	public static void main(String args[])throws IOException
	{
	System.out.println("enter numbers");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num=Integer.parseInt(br.readLine());
	
		
		
		
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for (int j=2;j<i;j++)
			{
				if(i%2==0)
				{
					count++;
				}
			}
			if(count==0){
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
