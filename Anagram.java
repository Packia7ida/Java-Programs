import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the First String:");
        String str1=in.nextLine();
        System.out.print("Enter the Second String:");
        String str2=in.nextLine();

        String s1=str1.toLowerCase();
        String s2=str2.toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.print("The Strings are not Anagrams...");
        }

        else{
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1,c2)==true){
                System.out.print("The Strings are Anagram.");
            }
            else{
                System.out.print("The Strings are not a Anagram.");
            }
        }
    }
}
