import java.util.Scanner;
public class ParenthesesMatching {
    public static void main(String args[]){
//        Scanner in=new Scanner(System.in);
//        System.out.print("Enter the Brackets:");
//        String str=in.nextLine();
//        if(isValidParantheses(str)){
//            System.out.println("The Bracket is balanced");
//        }
//        else{
//            System.out.println("The Bracket is unbalanced");
//        }
//    }
//    public static boolean isValidParantheses(String s){
//        int balance=0;
//        for(char ch:s.toCharArray()){
//            if(ch=='('){
//                balance++;
//            }
//            else if(ch==')'){
//                balance--;
//            }
//            if(balance<0){
//                return false;
//            }
//        }
//        return balance==0;
                Scanner in = new Scanner(System.in);

                System.out.print("Enter the string of parentheses: ");
                String input = in.nextLine();

                int balance = 0;
                boolean isValid = true;

                for (char ch : input.toCharArray()) {
                    if (ch == '(') {
                        balance++;
                    } else if (ch == ')') {
                        balance--;
                    }
                    if (balance < 0) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid && balance == 0) {
                    System.out.println("The parentheses are balanced.");
                } else {
                    System.out.println("The parentheses are not balanced.");
                }
    }
}
