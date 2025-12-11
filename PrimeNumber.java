package BasicPrograms;

public class PrimeNumber {
    public static void main(String args[]){
        int number= 16;
        int count=0;
        for(int i=1;i<=number;i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.print(number+" is a Prime");
        }
        else{
            System.out.print(number+" is Not a prime");
        }
    }
}
