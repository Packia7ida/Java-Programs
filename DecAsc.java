package Array;

public class DecAsc {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int i = 0;
        int j = arr.length - 1;
        int k = 0;
        int res[] = new int[arr.length];
        while (i <= j) {
            if (k < arr.length ) {
                res[k++] = arr[j--];
            }
            if (k < arr.length ) {
                res[k++] = arr[i++];
            }
        }
        for (int x : res) {
            System.out.print(x+" ");
        }
    }
}