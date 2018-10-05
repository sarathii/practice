import java.io.BufferedReader;
import  java.io.*;
public class Leap {
	
	
	public static void main(String args[])throws IOException
	{
		
	long year;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		year=Long.parseLong(br.readLine());
		if((year%4==0)&&(year%100!=0))
		{
			System.out.println("leap year");
		}
		else if((year%100==0)&&(year%400==0))
		{
			
			System.out.println("leap year");
		}
		
		
		else if(year%400==0)
		{
			System.out.println("leap");
		}
		else{
			System.out.println("not a leap year");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
