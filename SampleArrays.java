import java.util.Arrays;
import java.util.Scanner;
public class SampleArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number:");
        for (int i = 0; i < n; i++) {
            System.out.print("num " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        //to copy the element
//            int[] copiedArray = new int[n];
//            for (int i = 0; i < n; i++) {
//                copiedArray[i] =a[i];
        int[] copiedArray = Arrays.copyOf(a, n);
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
            for(int i=0;i<copiedArray.length-1;i++){
                for(int j=i+1;j<copiedArray.length;j++){
                    if(copiedArray[i]==copiedArray[j] && i!=j){
                        break;
                    }
                    System.out.print("duplicate: " +copiedArray[j] );
                }
            }
    }
}


