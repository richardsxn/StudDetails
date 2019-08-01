package constructors;

public class DefaultConstructor {
	DefaultConstructor(int a,int b){
     System.out.println("sum of no "+a+b);
}
public int addNum(int a,int b,int c)
{
	int sum=a+b+c;
	System.out.println(sum);
	return sum;
}


	public static void main(String[] args) {
		DefaultConstructor n=new DefaultConstructor(2,3);
		n.addNum(33, 77, 66);
		

	}

}
