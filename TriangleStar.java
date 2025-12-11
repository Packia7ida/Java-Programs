package Pattern;

public class TriangleStar {
    public static void main(String args[]){
        int n=6;
        int i,j,k;
        for(i=1;i<=n-1;i++){
            for(k=1;k<=n-i-1;k++) {
                System.out.print(" ");
            }
            for (j=1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
