package str;

import java.util.Scanner;

public class ArrayStringReverse {
//	static void print(String s) 
//    { 
// 
//        String fst = ""; 
//        int i = 0; 
//        for (i = 0; i < s.length();) { 
//  
//                        while (s.charAt(i) != ' ') { 
//                fst = fst + s.charAt(i); 
//                i++; 
//            } 
//  
//           
//            break; 
//        } 
//  
//        
//        String last = ""; 
//        int j = 0; 
//        for (j = s.length() - 1; j >= i;) { 
//  
//             
//            while (s.charAt(j) != ' ') { 
//                last = s.charAt(j) + last; 
//                j--; 
//            } 
//  
//           
//            break; 
//        } 
//  
//        
//        
//        for (int m = j; m >= i; m--) { 
//  
//            
//            System.out.print(s.charAt(m)); 
//        } 
//  
// 
//        System.out.println(fst); 
//    } 

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter value;");
		String name=s.nextLine();
		
		
		
		String[] MainString = name.toString().split("\\s+");
         
		
		  
		
		int reverse= MainString.length;
		
		for(int i=reverse-1;i>-1;i--)
		{
			name.substring(0, name.indexOf(MainString[i]));
							System.out.println(MainString[i]);
							
							
	}
//		String s1 = " "; 
//        print(s1); 
	}
}
