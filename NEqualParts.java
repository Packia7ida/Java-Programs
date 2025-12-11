package Programs.JavaStringPrograms;

public class NEqualParts {
    public static void main(String[] args) {
        String str="Corporations";
        int len=str.length();
        int temp=0;
        int n=4, divide=len/n;
        String[] equalStr=new String[n];
        if (len % n != 0) {
            System.out.println("Not divided");
        }
        else{
            for(int i=0;i<len;i=i+divide){
                equalStr[temp]= str.substring(i,i+divide);

//                String con =str.substring(i,i+divide);
//                equalStr[temp]=con;
                temp++;
            }
            System.out.println("Equal String are:");
            for(int i=0;i<equalStr.length;i++){
                System.out.println(equalStr[i]);
            }
        }
    }
}
