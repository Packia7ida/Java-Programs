import java.util.*;
public class SamplePrograms {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int number;
        while(true){
            System.out.print("Enter the number:");
            String noInput=in.nextLine().trim();
            if(noInput.matches("\\d+")){
                number=Integer.parseInt(noInput);
                break;
            }
            else{
                System.out.println("Error:Enter the whole numbers....");
            }
        }
        int originalNumber=number;
        //sum of digits
        int sum=0,digit;
        while(number!=0){
            digit=number%10;
            sum+=digit;
            number=number/10;
        }
        System.out.print("Sum of the Number:"+sum);
        System.out.println();
        //reverse the number
        number=originalNumber;
        int reverse=0,rem;
        while(number!=0){
            rem=number%10;
            reverse=(reverse*10)+rem;
            number=number/10;
        }
        System.out.print("Reverse of the Number:"+reverse);
        System.out.println();
        //max
        number=originalNumber;
        int maxDigit=0;
        while(number!=0){
            digit=number%10;
            if(digit>maxDigit){
                maxDigit=digit;
            }
            number=number/10;
        }
        System.out.print("Maximum number is:"+maxDigit);
        System.out.println();
        //min
        number=originalNumber;
        int minDigit=9;
        while(number!=0){
            digit=number%10;
            if(digit<minDigit){
                minDigit=digit;
            }
            number=number/10;
        }
        System.out.print("Minimum number is:"+minDigit);
        System.out.println();
        //average
        number=originalNumber;
        int averageOfNumber,count=0;
        for(int temp=number;temp!=0;temp/=10){
            count++;
        }
        averageOfNumber=sum/count;
        System.out.print("Average of the number is:"+averageOfNumber);
        System.out.println();
        //finding index
        number=originalNumber;
        int index=-1;//not found.
        int digitToFind;
        String strNumber=Integer.toString(number);
        while(true){
            System.out.print("Digit to find the index value:");
            String indexNumber=in.nextLine().trim();
            if(indexNumber.matches("\\d") && strNumber.contains(indexNumber)){
                digitToFind=Integer.parseInt(indexNumber);
                break;
            }
            else{
                System.out.print("Enter the digit which is present...:");
            }
        }

        for(int i=0;i<strNumber.length();i++){
            if(strNumber.charAt(i)-'0'==digitToFind){// -'0' convert the character to its numeric value
                index=i;
                break;
            }
        }
        if (index!=-1) {
            System.out.println("The digit " + digitToFind + " is found at index " + index);
        } else {
            System.out.println("The digit " + digitToFind + " is not found in the number.");
        }
        //print the number in string format
        System.out.print("String format of a number is:");
        for(int i=0;i<strNumber.length();i++){
            char ch=strNumber.charAt(i);
            switch(ch){
                case '0':System.out.print(" zero ");break;
                case '1':System.out.print(" one ");break;
                case '2':System.out.print(" two "); break;
                case '3':System.out.print(" three ");break;
                case '4':System.out.print(" four "); break;
                case '5':System.out.print(" five ");break;
                case '6':System.out.print(" six" );break;
                case '7':System.out.print(" seven ");break;
                case '8':System.out.print(" eight ");break;
                case '9':System.out.print(" nine ");break;

            }
        }
        System.out.println();
        //mid element
        if(strNumber.length()%2==1){
            int midIndex=strNumber.length()/2;
            System.out.print("Mid element is:"+strNumber.charAt(midIndex));
        }
        else{
            int midIndex1=(strNumber.length()/2)-1;
            int midIndex2=strNumber.length()/2;
            System.out.print("Mid elements are:"+strNumber.charAt(midIndex1)+"and"+strNumber.charAt(midIndex2));
        }
        System.out.println();
        //Armstrong number
        number=originalNumber;
        int result=0;
        while(number!=0){
            digit=number%10;
            result+=digit*digit*digit;
            number=number/10;
        }
        if(result==originalNumber){
            System.out.print(originalNumber+" is an Armstrong number");
        }
        else{
            System.out.print(originalNumber+" is not  an Armstrong number");
        }
        System.out.println();
        //count
        number=originalNumber;
        int noCount=0;
        for(int temp=number;temp!=0;temp/=10){
            noCount++;
        }
        System.out.print("Count of a number:"+noCount);
        System.out.println();
        // Repeating Count
        number = originalNumber;
        int target;
        String strNum=Integer.toString(number);
        System.out.print("Enter the digit to count occurrences: ");
        String targetNumber = in.nextLine().trim();
        while(true){
            if(targetNumber.matches("\\d")&& strNum.contains(targetNumber)){
                target=Integer.parseInt(targetNumber);
                break;
            }
            else{
                System.out.print("Enter the number which is present:");
                targetNumber = in.nextLine().trim();
            }
        }
        int targetCount = 0;
        while (number != 0) {
            digit = number % 10;
            if (digit == target) {
                targetCount++;
            }
            number = number / 10;
        }
        System.out.println("The digit " + target + " appears " + targetCount + " times.");
        //replacing number
        number=originalNumber;
        int toRemove;
        String strNumb=Integer.toString(number);
        System.out.print("Enter the number you want to remove:");
        String removeNo=in.nextLine().trim();;
        while(true){
            if(removeNo.matches("\\d")&& strNumb.contains(removeNo)){
                toRemove=Integer.parseInt(removeNo);
                break;
            }
            else{
                System.out.print("Enter the number which is present:");
                removeNo=in.nextLine().trim();
            }
        }
        int toReplace;
        String strNo=Integer.toString(number);
        System.out.print("Enter the number you want to replace:");
        String replaceNo=in.nextLine().trim();
        while(true){
            if (replaceNo.matches("\\d") ) {
                toReplace=Integer.parseInt(replaceNo);
                break;
            }
            else{
                System.out.print("Enter the whole number:");
                replaceNo=in.nextLine().trim();
            }
        }
        int results=0,multiplier=1;
        while(number!=0){
            int digit3=number%10;//153  15
            if(digit3==toRemove) {//3  5
                digit3 = toReplace;
           }
            results+=digit3*multiplier;//3
            multiplier*=10;//30
            number/=10;//15
       }
        System.out.print("After the replacement:"+results);

   }
}

