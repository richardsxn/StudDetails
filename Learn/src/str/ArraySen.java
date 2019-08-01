package str;

import java.util.Scanner;

public class ArraySen {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the sentence:=");
		while(s.hasNext())
		{
			String sentence=s.nextLine();
			String[] a=sentence.split(" ");
			int voca=0;
			for(int i=0;i<a.length;i++)
			{
				voca++;
				
			}
			System.out.println(voca);
		}

	}

}
