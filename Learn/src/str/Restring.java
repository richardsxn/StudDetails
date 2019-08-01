package str;

public class Restring {


		public String[] reverseString(String[] words)
		{
			String[] i= {"india","vs","pakistan"};
		    String[] t=new String[words.length];

		    for(int i1=0;i1<words.length;i1++)
		    {
		        for(int j=words[i1].length()-1;j>=0;j--)
		        {
		            t[i1]+=words[i1].substring(j,j+1);
		            System.out.println(t);
		        }
		    }
		    return t;
		}
	}


