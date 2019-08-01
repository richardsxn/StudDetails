package str;




import java.util.Scanner;


public class ReverseSpace {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                // Getting String input
                System.out.print("Enter text: ");
                String myString = input.nextLine();


                char[] inputArray = myString.toCharArray();
                System.out.println("Array "+inputArray.length);

                for(int i= 0; i<inputArray.length;i++)
                {
                        System.out.print(inputArray[i]);
                }

                int pos = 0;
                for(int i= 0; i<inputArray.length;i++)
                {

                        if(inputArray[i] == ' ')
                        {                               
                                pos++;
                        }                                               
                }
                int[] spacePosition = new int[pos];

                int j = 0;
                for(int i= 0; i<inputArray.length;i++)
                {

                        if(inputArray[i] == ' ')
                        {
                                spacePosition[j] =i;
                                j++;
                                System.err.println(i);
                        }
                }               

                int spcLength = spacePosition.length;
                System.out.println("--"+spcLength);
                System.out.println("Text entered = " + myString);
                System.out.println("Input Length first word end :"+spacePosition[0]);
                System.out.println("First word :"+stringReverse(inputArray, 0,
spacePosition[0]));

                System.out.println("Last word Start:"+spacePosition[spcLength-1] +"End: "+inputArray.length);
                System.out.println("Last word :"+stringReverse(inputArray,
spacePosition[spcLength-1], inputArray.length-1));

                System.out.println("Middle word "+spacePosition.length/2);
                System.out.println("Position "+spacePosition[(spacePosition.length/2)-1]);
                System.out.println("Middle word :"+stringReverse(inputArray,
spacePosition[(spacePosition.length/2)-1],
spacePosition[(spacePosition.length/2)]));
        																		.052..args...args...3..3}

public static String stringReverse(char[] arrayString, int start, int end)
{
        String reverse = "";
                for (int i = end; i >= start; i--) {
                        reverse = reverse + arrayString[i];                     
                }
        return reverse; 
}
}


