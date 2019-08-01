package str;

import java.util.Scanner;

public class RevStr {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String f=s.nextLine();
		String [] l=f.split(" ");
		String temp=l[0];
		l[0]=l[l.length-1];
		l[l.length-1]=temp;
		
		for (int i=0;i<(l.length);i++)
		{
			
			 System.out.println(l[i]+" ");
			 
			 
						
		}
		
		
	}

}
