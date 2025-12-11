package Pattern;

public class RevNumTriangle {
    public static void main(String args[]){
        int n=5;
        int i,j,k;
        for(i=1;i<=n;i++){
            for(k=1;k<i;k++) {
                System.out.print(" ");
            }
            for (j=i; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
