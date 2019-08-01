package str;

import java.util.Scanner;

public class InStr {

	

	

	private static Scanner inps;

	public static void main(String[] args) {
		
		int[] a=new int[6];
		inps = new Scanner(System.in);
		System.out.println("enter the no:");
		for(int j=0;j<6;j++)
		{
		 	a[j]=inps.nextInt();
			System.out.println("Array Elements :");
		}
		for(int i=0;i<a.length;i++)
		{
		
			System.out.println(a[i]);
		}

	}

}
