package Pattern;

public class Rhombus {
    public static void main(String args[]){
        int n=5;
        int i,j,k;
        for(i=n;i>=1;i--){
            for(k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for (j=1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
