import java.util.*;
import java.util.Arrays;
public class ArrayOfPrograms {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int number;
        while(true){
            System.out.print("Enter the number of elements:");
            String noInput=in.nextLine().trim();
            if(noInput.matches("\\d+")){
                number=Integer.parseInt(noInput);
                break;
            }
            else{
                System.out.print("Error:Enter the valid whole numbers:");
            }
        }
        //get the elements...
        int[] orgArray = new int[number];
        System.out.println("Enter the elements:");
        for (int i = 0; i < number; i++) {
            System.out.print("num " + (i + 1) + ": ");
            while (true) {
                String input = in.nextLine().trim();
                if (input.matches("\\d+")) { // Validate if input is a number
                        orgArray[i] = Integer.parseInt(input);
                        break;
                }
                else {
                    System.out.print("Error: Enter a valid whole number:");
                }
            }
        }
        System.out.println("Array is: " + Arrays.toString(orgArray));
        int[] copiedArray = Arrays.copyOf(orgArray, number);
        //ASC
        int temp;
        for (int i = 0; i < copiedArray.length-1; i++) {
            for (int j = i + 1; j < copiedArray.length; j++) {
                if (copiedArray[i] > copiedArray[j]) {
                    temp = copiedArray[i];
                    copiedArray[i] = copiedArray[j];
                    copiedArray[j] = temp;
                }
            }
        }
        System.out.println("asc sort: "+Arrays.toString(copiedArray));
        //DESC
        for(int i=0;i<copiedArray.length-1;i++){
            for(int j=i+1;j<copiedArray.length;j++){
                if (copiedArray[i]<copiedArray[j]) {
                    temp=copiedArray[i];
                    copiedArray[i]=copiedArray[j];
                    copiedArray[j]=temp;
                }

            }
        }
        System.out.println("desc sort: "+Arrays.toString(copiedArray));
        //to find duplicate
        String duplicates = ""; // String to store duplicates
        for (int i = 0; i < orgArray.length; i++) {
            for (int j = i + 1; j < orgArray.length; j++) {
                if (orgArray[i] == orgArray[j] && !duplicates.contains(String.valueOf(orgArray[i]))) {
                    // Add the duplicate to the string if not already present
                    if (!duplicates.isEmpty()) {
                        duplicates += ", ";
                    }
                    duplicates += orgArray[i];
                }
            }
        }
        // Display the duplicates
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates: " + duplicates);
        }
    }
}
