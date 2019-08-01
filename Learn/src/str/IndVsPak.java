package str;

import java.lang.reflect.Array;
import java.util.Scanner;

public class IndVsPak {

//	public static void main(String[] args) {
//		for(int i=0;i<=17;i++)
//		{
//			Object[] a;
//			if(a[i].equals(""))
//			{
//				int start = 0;
//				int space = 1;
//			}
//			reverse([]);
//		
//		}
//	}
//
//
//	private static void reverse( Class<a[]> ,start,end) {
//	 Object start;
//	for(Object i = start;i<=end;i++)
//	 {
//		 Object temp = a[(int) i];
//		 int last;
//		a[last]=temp;
//		 last=last-1;
//	 }
//		
//	}

		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String myString=input.nextLine();
		
		String[] myword= new String[];
		char[] inputArray = myString.toCharArray();
		System.out.println("Array"+inputArray.length);
		
		int pos=0;
		String Firstword.Lastword.inputword;
		String finalvalue;
		int word;
		for(int i=0;i<inputarray.length;i++)
			if(inputarray[i]=' ')
			{
				myword[pos]=word;
				pos++;
				word=" ";
			}
			else
			{
				word=word+inputarray[i];
				
			}
		
	}
	System.out.println("no of empty spaces"+pos);
	Firstword=myword[0];
	Lastword=myword[myword.length-1];
}