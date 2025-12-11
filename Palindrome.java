package BasicPrograms;

public class Palindrome {
    public static void main(String args[]){
        int number= 457;
        int temp=number;
        int reverse=0;
        while(temp!=0){
            int rem = temp%10;
            reverse=(reverse*10)+rem;
            temp= temp/10;
        }
        if(number==reverse){
            System.out.print(number+" is a Palindrome");
        }
        else{
            System.out.print(number+" is not a Palindrome");
        }
    }
}
