package Programs.JavaStringPrograms;

public class Subsets {
    public static void main(String[] args) {
        String str="FUN";
        int len=str.length();
        int temp=0;
        String[] strings=new String[(len*(len+1))/2];
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                strings[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        System.out.println("Subsets are:");
        for(int i=0;i< strings.length;i++){
            System.out.println(strings[i]);
        }
    }
}
