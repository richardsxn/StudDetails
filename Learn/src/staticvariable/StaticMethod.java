package staticvariable;

public class StaticMethod {

	public static void main(String[] args) {
		
		
//		System.out.println(Rectangle.getArea(0, 0));
//		Rectangle.getArea(323, 654);
		
		Rectangle r1=new Rectangle();
		r1.getArea(446, 324);
	}

}

class Rectangle{
	public static int getArea(int l,int b)
	{
		return l*b;
	}
}
