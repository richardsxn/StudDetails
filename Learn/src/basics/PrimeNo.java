package basics;

import java.util.Scanner;

public class PrimeNo {

	

	private static Scanner s;

	public static void main(String[] args) {
		int n;
		int p;
		
		
		System.out.println("enter the no:");
		s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=2;i<=n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					p=1;
				
			}
			if(p==0)
				System.out.println(i);
		}
	}

}
