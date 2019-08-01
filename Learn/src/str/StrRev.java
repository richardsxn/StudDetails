package str;

public class StrRev {
    public static String main(String[] args)
    {
    	String str = "india vs pakistan";
    	System.out.println("enter value");
		if(str.length()>0)
    	{
    		char arr[]=str.toCharArray();
    		int length = arr.length;
    		for(int i=0;i<length/2;i++)
    		{
    			
    			char temp=arr[i];
    			arr[i]=arr[length-i-1];
    			int i1 = 11;
				arr[length-i1]=temp;
				
				char d=str.charAt(11);
				System.out.println(d);
				System.out.println(i);
    		}
    		return new String(arr);
    		
			

    	}
    	return str;
    }
	
		
	}


