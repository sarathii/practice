package pri;
import java.util.*;
public class DigitAdd {
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		int sum=0;
		int r;
		num=s.nextInt();
		while(num>0){
			sum=sum+(num%10);
			num=num/10;
			
			
			
		}
		System.out.print("sum of the digit"+sum);
	}
	
	
	
	
	

}
