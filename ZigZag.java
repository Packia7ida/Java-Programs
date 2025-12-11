import java.util.Scanner;

public class ZigZag {
        public static void main(String args[]){
            Scanner in=new Scanner(System.in);
            String strInput;
            int n;
            //letters
            while (true) {
                System.out.print("Enter the String (no spaces): ");
                strInput = in.nextLine();
                if (strInput.matches("[a-zA-Z]+")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a string with only alphabets and no spaces.");
                }
            }
            //n
            while (true) {
                System.out.print("Enter the number of rows (positive integer): ");
                if (in.hasNextInt()) {
                    n = in.nextInt();
                    if (n >= 1 && n <= strInput.length()) {
                        break;
                    } else {
                        System.out.println("Invalid input! Number of rows must be between 1 and the length of the string.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a positive integer.");
                    in.next(); // Clear invalid input
                }
            }
            int len=strInput.length();
            for(int i=0;i<n;i++){
                for(int j=0;j<len;j++){
                    int cycle=2*(n-1);
                    if(j%cycle==i || j%cycle==cycle-i)
                    {
                        System.out.print(strInput.charAt(j));
                    }
                    else{System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}



