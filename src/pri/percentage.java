package pri;

import java.util.Scanner;

public class percentage {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);	
	float sum=0;
int sub=s.nextInt();
float mark[]=new float[sub];
	System.out.println("enter num of subject");
	for(int i=0;i<sub;i++)
	{System.out.println("enter"+ i+1 +"mark");
		mark[i]=s.nextInt();
		 sum=sum+mark[i];
	}
	float avg=sum/sub;
	
	
	System.out.println(avg );
	float per=sum/5;
	System.out.println(per );
	}
}
