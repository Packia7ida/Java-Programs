package Pattern;

public class HollowHourGlass {
    public static void main(String args[]){
        int n=7;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==j||i==0||j==n-i-1||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
