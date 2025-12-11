package BasicPrograms;

public class Armstrong {
    public static void main(String args[]){
        int number =153;
        int temp=number;

//        int digit1=temp%10;
//        temp=temp/10;
//
//        int digit2=temp%10;
//        temp=temp/10;
//
//        int digit3=temp%10;
//
//        int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
//
//        if(number==result){
//            System.out.print(number+" is a Amrstrong Number");
//        }
//        else{
//            System.out.print(number+" is not a Amrstrong Number");
//        }

        int result=0;
        while (temp!=0){
            int digit = temp%10;
            result +=digit*digit*digit;
            temp=temp/10;
        }
        if(number==result){
            System.out.println(number+" is an Armstrong Number");
        }
        else{
            System.out.println(number+" is not an Armstrong Number");
        }
    }
}
