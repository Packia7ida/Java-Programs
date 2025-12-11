package Programs.JavaStringPrograms;

public class VowelsConsonants {
    public static void main(String[] args) {
        String str="How are you";
        String lower=str.toLowerCase();
        int vcount=0,ccount=0;
        for(int i=0;i<lower.length();i++){
            if(lower.charAt(i)=='a' || lower.charAt(i)=='e' || lower.charAt(i)=='i' || lower.charAt(i)=='o' || lower.charAt(i)=='u'){
                vcount++;
            }
            else if(lower.charAt(i)!=' '){
                ccount++;
            }
        }
        System.out.println("Vowels: "+vcount);
        System.out.println("Consonants: "+ccount);
    }
}
