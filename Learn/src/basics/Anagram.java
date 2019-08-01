package basics;


import java.util.Scanner;
public class Anagram {

	    private static Scanner scan;

		public static void main(String[] input)
	    {
	        String str1, str2;
	        int len, len1, len2, i, j, search=0, nosearch=0;
	        scan = new Scanner(System.in);
	        
	        System.out.print("Enter First String : ");
	        str1 = scan.nextLine();
	        System.out.print("Enter Second String : ");
	        str2 = scan.nextLine();
	        
	        len1 = str1.length();
	        len2 = str2.length();
			
	        if(len1 == len2)
	        {
	            len = len1;
	            for(i=0; i<len; i++)
	            {
	                search = 0;
	                for(j=0; j<len; j++)
	                {
	                    if(str1.charAt(i) == str2.charAt(j))
	                    {
	                        search = 1;
	                        break;
	                    }
	                }
	                if(search == 0)
	                {
	                    nosearch = 1;
	                    break;
	                }
	            }
	            if(nosearch == 1)
	            {
	                System.out.print("Strings are not Anagram to Each Other..!!");
	            }
	            else
	            {
	                System.out.print("Strings are Anagram");
	            }
	        }
	        else
	        {
	            System.out.print(" Character should  be an Anagram");
	        }
	    }
	}


