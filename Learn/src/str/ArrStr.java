package str;

public class ArrStr {

	private static int x;

	public static void main(String[] args) {
		int[] intArray = new int[] {1,2,3,4,5};
		String[] strArray=new String[]{"one","two","three","four","five"};
	
		int i;
		for( i= 0;i<intArray.length;i++)
		{
			x=intArray[i];
			System.out.println(x);
		
		}
		for(int j=0;j<strArray.length;j++)
		{
			
			System.out.println(strArray[j]);
		}
//		System.out.println(Arrays.toString(strArray));
//		 System.out.println(Arrays.toString(intArray));
//      System.out.println(intArray);
//      System.out.println(strArray);
     
	}

}
