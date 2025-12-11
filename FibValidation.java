import java.util.*;
import java.lang.String;
public class FibValidation {
     public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
         int n;
         while (true) {
             System.out.print("Enter the number of terms (positive integer): ");
             String input = in.nextLine().trim();
             if (input.matches("\\d+")) {
                 n = Integer.parseInt(input);
                 if (n > 0) {
                     break;
                 } else {
                     System.out.println("Please enter a positive integer greater than zero.");
                 }
             } else if (input.contains(" ") || input.matches(".*\\D.*")) {
                 System.out.println("Invalid input! Please enter a single positive integer without spaces or special characters.");
             } else {
                 System.out.println("Invalid input! Please try again.");
             }
         }
            System.out.println("Fibonacci Series for " + n + " terms:");
            {
                int a=-1,b=1,c;
                for(int i=0;i<n;i++){
                    c=a+b;
                    System.out.print(c +" " );
                    a=b;
                    b=c;
                }
            }
     }
}


