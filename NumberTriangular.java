package Pattern;

public class NumberTriangular {
    public static void main(String args[]){
        int n=5;
        int i,j,k;
        for(i=1;i<=n;i++){
            for(k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for (j=1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
