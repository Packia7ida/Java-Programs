public class DivideString {
    public static void main(String[] args) {
        String str = "aaaaabbbbbccccc";
        int n=3;
        int len=str.length();
        if(len%n!=0){
            System.out.print("Can't divide the String");
        }
        else{
            int partLen=len/n;
            System.out.println("Divided Strings are:");
            for(int i=0;i<n;i++){
                System.out.println(str.substring(i*partLen,(i+1)*partLen));
            }
        }
    }
}
