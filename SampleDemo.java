import java.util.*;
class Demo1 {
      public void calculateLeapYear(int year){
          if((year%4==0 &&year%100!=0) || (year%400==0)){
              System.out.print(year+ " is a leap year");
          }
          else{
              System.out.print(year+ " is not a leap year");
          }
      }
      public void calculateSTDDEV(double[] number){
          double sum=0.0;
          double mean;
          double standardDev=0.0;
          for(double num:number){
              sum+=num;
          }
          mean=sum=number.length;
          for(double num:number){
              standardDev+=Math.pow((num-mean),2);
          }
//          double variance;
//          variance=standardDev/ numbers.length;
//          System.out.print("Variance is:"+variance);
          standardDev=Math.sqrt(standardDev/ number.length);
          System.out.print("Standard Deviation is:"+standardDev);
      }
      //user details
      public void displayUserDetails(String[] name, int[] age, String[] address, String[] phoneNumber, String[] department) {

              System.out.println("\nUser Details:");
              System.out.println("--------------------------------------------------------------------------------------");
              System.out.printf("|%-15s|%-5s|%-30s|%-15s|%-15s|\n", "Name", "Age", "Address", "Phone Number", "Department");
              System.out.println("--------------------------------------------------------------------------------------");
              for (int i = 0; i < name.length; i++) {
                  System.out.printf("|%-15s|%-5d|%-30s|%-15s|%-15s|\n", name[i], age[i], address[i], phoneNumber[i], department[i]);
                  System.out.println("--------------------------------------------------------------------------------------");
              }

      }
}
class Demo2 {
    public static void switchCase(int ch) {
        switch (ch) {
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Red");
                break;
            case 3:
                System.out.println("Blue.");
                break;
            default:
                System.out.println("Black");
                break;
        }
    }
    public static void staticVariablesExample() {
        // Static Variable Example
        staticVariableExample();

        // Final Variable Example
        final int MAX_ATTEMPTS = 5;
        System.out.println("Max Attempts: " + MAX_ATTEMPTS);

        // Increment/Decrement Example
        int count = 0;
        count++;
        System.out.println("Incremented Count: " + count);
        count--;
        System.out.println("Decremented Count: " + count);
    }

    // Static method for static variable demonstration
    public static void staticVariableExample() {
        staticVariableExample.staticCounter++;
        System.out.println("Static Counter: " + staticVariableExample.staticCounter);
    }

    // Static nested class to demonstrate static variables
    static class staticVariableExample {
        static int staticCounter = 0; // Static variable
    }
}
public class SampleDemo {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Demo1 a=new Demo1();
        Demo2 b=new Demo2();
        //leap year
        int year;
        while(true) {
            System.out.print("Enter the year:");
            String yearString=in.nextLine().trim();
            if(yearString.matches("^(19\\d{2}|20[0-2]\\d|2030)$")){
                year=Integer.parseInt(yearString);
                break;
            }
            else{
                System.out.print("Error!");
            }

        }
        a.calculateLeapYear(year);
        System.out.println();
        //STDDEV
        int number;
        while(true){
            System.out.print("Enter the number of elements:");
            String noInput=in.nextLine().trim();
            if(noInput.matches("^([0-9]|20)$")){
                number=Integer.parseInt(noInput);
                break;
            }
            else{
                System.out.print("Error!");
            }
        }
        double[] numbersArray=new double[number];
        System.out.println("Enter the elements:");
        for (int i = 0; i < number; i++) {
            System.out.print("num " + (i + 1) + ": ");
            while (true) {
                String input = in.nextLine().trim();
                if (input.matches("\\d+(\\.\\d+)?")) {
                    numbersArray[i] = Double.parseDouble(input);
                    break;
                }
                else {
                    System.out.print("Error!Enter a Integer or Double:");
                }
            }
        }
        a.calculateSTDDEV(numbersArray);
        System.out.println();
        //user details
        int numberOfUsers;
        while(true){
            System.out.print("Enter the number of Users: ");
            String noInput=in.nextLine().trim();
            if (noInput.matches("^([0-9]|20)$")){
                numberOfUsers=Integer.parseInt(noInput);
                break;
            }
            else{
                System.out.print("Error!");
            }
        }
        //declare array
        String userName[]=new String[numberOfUsers];
        int ageOfUser[]=new int[numberOfUsers];
        String address[]=new String[numberOfUsers];
        String phoneNo[]=new String[numberOfUsers];
        String department[]=new String[numberOfUsers];
        for(int i=0;i<numberOfUsers;i++) {
            System.out.println("Enter the Details of Student " + (i + 1) + ":");
            //name
            while (true) {
                System.out.print("Name (letters only): ");
                String nameInput = in.nextLine().trim();
                if (nameInput.matches("[a-zA-Z ]+")) {
                    String[] words = nameInput.split(" ");
                    StringBuilder pascalCaseName = new StringBuilder();
                    for (String word : words) {
                        if (!word.isEmpty()) {
                            pascalCaseName.append(Character.toUpperCase(word.charAt(0)))
                                    .append(word.substring(1).toLowerCase())
                                    .append(" ");
                        }
                    }
                    userName[i] = pascalCaseName.toString().trim();
                    break;
                } else {
                    System.out.println("Error: Name must contain only letters and spaces.");
                }
            }
            //age of user
            while (true) {
                System.out.print("Enter the age of user:");
                String inputValue = in.nextLine().trim();
                if (inputValue.matches("\\d{2}")) {
                    ageOfUser[i] = Integer.parseInt(inputValue);
                    break;
                } else {
                    System.out.print("Error!");
                }
            }
            //address
            while (true) {
                System.out.print("Enter your address: ");
                String add = in.nextLine().trim();
                if (add.matches("^[a-zA-Z0-9.,\\s]+$")) {
                    address[i] = add;
                    break;
                } else {
                    System.out.println("Error: Enter a valid address (letters, numbers, commas, periods, spaces).");
                }
            }
            //phone no
            while (true) {
                System.out.print("Enter the Phone number:");
                String inputValue = in.nextLine().trim();
                if (inputValue.matches("\\d{10}")) {
                    phoneNo[i] = inputValue;
                    break;
                } else {
                    System.out.print("Error!");
                }
            }
            //department
            while (true) {
                System.out.print("Enter your department: ");
                String depart = in.nextLine().trim();
                if (depart.matches("^[a-zA-Z\\s]+$")) {
                    department[i] = depart;
                    break; // Department is valid
                } else {
                    System.out.println("Error: Enter a valid department (letters and spaces only).");
                }
            }
        }
        a.displayUserDetails(userName, ageOfUser, address, phoneNo, department);

            //switch case
            int ch;
            while(true) {
                System.out.print("Enter a number (1-3) for Switch Case: ");
                String inputValue = in.nextLine().trim();
                if (inputValue.matches("[1-3]")) {
                    ch = Integer.parseInt(inputValue);
                    break;
                } else {
                    System.out.print("Error!");
                }
            }
            b.switchCase(ch);
            b.staticVariablesExample();
    }
}
