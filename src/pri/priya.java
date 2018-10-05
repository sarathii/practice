package pri;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class priya {

	public static void main(String args[]) throws IOException {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a charaterto find  vowel");
		//char ch = s.next().charAt(0);
	/*	switch (ch) {

		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':

			System.out.println("vowel");
			break;
default:
	System.out.print("not a vowel");
		}*/
		
		
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("not a vowel");
		}
		
		

	}

}
