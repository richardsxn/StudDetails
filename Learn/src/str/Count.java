package str;

public class Count {

	public static void main(String[] args) {
	
		int sentence=1;
		String str="today have match ind vs pak ,who won the match";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			sentence++;
		}
		System.out.println(sentence);
		System.out.println(sentence-1);
	}

}
