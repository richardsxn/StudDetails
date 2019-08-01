package staticvariable;

public class StaticVar {

	public static void main(String[] args) {
		
 Counter c1=new Counter();
 c1.incrementCounter();
 
 Counter c2=new Counter();
 c2.incrementCounter();
	}

}

class Counter{

	static int c=0;
	public void incrementCounter() {
		c++;
		System.out.println(c);
	}
}