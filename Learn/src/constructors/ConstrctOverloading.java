package constructors;

public class ConstrctOverloading {

	
		int id;
		String name;
		int age;
		
		ConstrctOverloading(int i,String n)
		{
			id=i;
			name=n;
			System.out.println(id+" "+name);
		}
		ConstrctOverloading(int i,String n,int a)
		{
			id=i;
			name=n;
			age=a;
			System.out.println(id+" "+name+" "+age);
		}
		void display() {
			System.out.println(id+" "+name+" "+age);
		}
		public static void main(String[] args) {
			ConstrctOverloading s1=new ConstrctOverloading(07,"richard");
			ConstrctOverloading s2=new ConstrctOverloading(7,"saxena",28);
			s1.display();
			s2.display();
			
	}

}
