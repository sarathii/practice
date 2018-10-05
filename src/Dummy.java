import java.io.*;
public class Dummy {
	
	public static void main(String args[])throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int count=0;    
		for (int i=1;i<num;i++)
		    {
		    	if(num%i==0)
		    	{
		    		count++;
		    	}
		    	
		    }
		if(count<=1)
		{
			System.out.println("'prime");
		}
		else{
			System.out.println("not a prime");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
