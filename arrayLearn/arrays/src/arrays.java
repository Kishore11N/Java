import java.util.Scanner;
import java.util.Arrays;

public class arrays {
   public static final int randomNumber = 1; 
   public static final double randomDouble = 3.16;
   public static final String randomGreeting = "Bye Kishore";
        public static void main(String[] args) throws Exception {        
                int[] myIntArray = new int[5];
                addNumbers(myIntArray);
                System.out.println("The length of the array is " + myIntArray.length + "  " +  (Arrays.toString(myIntArray)) + "\n" + randomGreeting);

        }
            static void addNumbers(int[]array){
                Scanner input = new Scanner (System.in);
                System.out.println("Please enter 5 random numbers : ");
                    for(int x = 0; x<5 ; x++){
                        int addToArray = input.nextInt();
                        array[x] = addToArray;
                    }
                input.close(); //Close the scanner
                    return;         
        }
    }
