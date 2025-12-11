import java.util.Scanner;
public class FuncString {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the String:");
            String strInput = in.nextLine();

            while (!strInput.matches("^[a-zA-Z ]+$")) {
                System.out.print("Error! Enter letters and spaces only: ");
                strInput = in.nextLine();
            }

            int vcount = 0, ccount = 0, charCount = 0, blankCount = 0;
            String upperCaseLetters = " ", lowerCaseLetters = " ";
            boolean hasUpperCase=true;
            boolean hasLowerCase=true;
            for (int i = 0; i < strInput.length(); i++) {
                char ch = strInput.charAt(i);
                //vowel
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    if ("aeiouAEIOU".indexOf(ch)!=-1) {
                        vcount++;
                    } else {
                        ccount++;
                    }
                }
                //uppercase
                if (Character.isUpperCase(ch)) {
                    upperCaseLetters += ch + " ";
                    hasUpperCase=true;
                }
                //lowercase
                if (Character.isLowerCase(ch)) {
                    lowerCaseLetters += ch + " ";
                    hasLowerCase=true;
                }
                //blank space
                if (Character.isWhitespace(ch)) {
                    blankCount++;
                }
            }
                //printing lower/upper(if no)
                if(!hasUpperCase){
                    upperCaseLetters="No uppercase";
                }
                if(!hasLowerCase){
                    lowerCaseLetters="No lowercase";
                }

            System.out.println("UpperCase are:" + upperCaseLetters);
            System.out.println("LowerCase are:" + lowerCaseLetters);

            //elements-->how many times appear
            System.out.print("Enter the character to find its frequency:");
            String strElement;
            while(true){
                strElement=in.nextLine().trim();
                if(strElement.matches("^[a-zA-Z]$") && strInput.contains(strElement)){
                    break;
                }
                else{
                    System.out.print("Enter the character present in the String...:");
                }
            }
            char charToFind = strElement.charAt(0);
            for (int i = 0; i < strInput.length(); i++) {
                if (strInput.charAt(i) == charToFind) {
                    charCount++;
                }
            }

            System.out.println("The Character " + charToFind + " appears " + charCount + " times ");
            System.out.println("Vowels Count is:" + vcount);
            System.out.println("Consonants Count is:" + ccount);
            System.out.println("Blank Space Count are:" + blankCount);

            System.out.println("Substring from index 3 to 7: " + strInput.substring(3, 7));
            System.out.println("Index of first occurrence of 'a': " + strInput.indexOf('a'));
            System.out.println("String after replacing 'a' with '@': " + strInput.replace('a', '@'));
            System.out.println("String in uppercase: " + strInput.toUpperCase());
            System.out.println("String in lowercase: " + strInput.toLowerCase());
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            in.close();
        }
    }
}
