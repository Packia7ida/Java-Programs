package Programs.JavaStringPrograms;

public class CountCharacters {
    public static void main(String[] args) {
        String str="This is my java programs";
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Characters Count: "+count);
    }
}
