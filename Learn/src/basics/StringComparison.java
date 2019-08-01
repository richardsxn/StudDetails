package basics;

public class StringComparison {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		

		Student student = new Student("Richard", 25,80);
		Student student2 = new Student("Richard", 25,80);
		Student student1 = new Student("Nicky", 12,80);
		System.out.println(student.name);
		System.out.println(student1.name);
		
		
		
		if (student.equals(student2))
		{
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
	
	@Override
	public int hashCode() {
		super.hashCode(); 
		
		return 80+25;
	}
	

}
