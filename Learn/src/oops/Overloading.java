package oops;

import basics.StringComparison;

public class Overloading {
	
	static int staticVariable = 0;
	
	public static void main(String[] args) {
		
		StringComparison comparison = new StringComparison();
		StringComparison comparison1 = new StringComparison();
		
		String string = new String("richard");
		String string1 = new String("richard");
		
		if(string.equals(string))
		{
			System.out.println("True String");
		}
		if(comparison.equals(comparison1))
		{
			System.out.println("object  true");
		}else
		{			
				System.out.println("object  false");
			
		}
		
		
		if(string == string1)
		{
			System.out.println("True");
		}else
		{
			System.out.println(string.hashCode());
			System.out.println(string1.hashCode());
			System.out.println("False");
		}
		
		System.out.println("-----------------");
		
		if(comparison == comparison1)
		{
			System.out.println("True");
		}else
		{
			System.out.println("False");
		}
	}
	
	public static int add(int a, int b){
		staticVariable =staticVariable+1;
		int add = 0;
		add = a+b;
		 
		return add;		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}
}
