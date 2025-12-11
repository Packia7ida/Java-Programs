import java.util.Scanner;
public class Fibanocci {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=in.nextInt();
        int a=-1,b=1,c;
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
