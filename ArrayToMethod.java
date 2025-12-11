package Array;

public class ArrayToMethod {
    static void mini(int arr[]){
        int min=arr[0];
        for(int i=0;i< arr.length;i++)
            if(min>arr[i])
                min=arr[i];
        System.out.println("Minimum of an array is:"+min);
    }
    public static void main(String args[]){
        int a[]={1,2,3,4};
        mini(a);
    }
}


