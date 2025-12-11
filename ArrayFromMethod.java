package Array;

public class ArrayFromMethod {
    //method -->returning the integer array
    static int[] get(){
        return new int[]{10,20,30,40};
    }

    public static void main(String args[]){
        //calling the method
        int arr[]=get();
        //store the values in arr[]
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
