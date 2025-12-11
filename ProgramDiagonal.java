public class ProgramDiagonal {
    public static void main(String args[]){
        String s="12345";
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if ( j==i ||j == n-1-i) {
                    System.out.print(s.charAt(j));
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
