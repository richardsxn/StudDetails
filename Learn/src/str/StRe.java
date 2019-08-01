package str;

import java.util.Arrays;

public class StRe {

		

		public static void main (String[] args)
		{
			String[] myArray = {"he","is","a","good","programmer"};
			
			System.out.println("Reverse : "+Arrays.toString(myArray));
			for(int i=0;i<myArray.length-1;i++)
			{
				
				
				String temp=myArray[i];
				myArray[i]=myArray[myArray.length-i-1];
				myArray[myArray.length-i-1]=temp;
			}
			System.out.print("result: ");
			for(int i=0;i<myArray.length;i++)
			{
					
				myArray[i]+=myArray[i].substring(i=4,i+2);
				System.out.print(myArray[i]);
				//reverseEachWordOfString("india vs pakistan");
			}
		}



//		private static void If(boolean b) {
//			// TODO Auto-generated method stub
//			
//		}
}
