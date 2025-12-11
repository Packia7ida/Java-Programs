public class Operators {
    public static void main(String args[]){
        int a=10;
        int b=6;
        //Arithmetic
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulus:"+(a%b));
        //Assignment
        System.out.println(a);
        a+=10;
        System.out.println(a);
        a-=1;
        System.out.println(a);
        a*=5;
        System.out.println(a);
        a/=4;
        System.out.println(a);
        a%=10;
        System.out.println(a);
        //Relational
        System.out.println("Equal to : "+(a==b));
        System.out.println("Not Equal to : "+(a!=b));
        System.out.println("Greater than : "+(a>b));
        System.out.println("Less than : "+(a<b));
        System.out.println("Greater than or equal to : "+(a>=b));
        System.out.println("Less than or equal to : "+(a<=b));
        //Logical
        System.out.println("AND &&:"+(a<5 && b>6));
        System.out.println("OR ||:"+(a<5 || b>6));
        //Conditional or Ternary Operators
        int c;
        c=a>b?a:b;
        System.out.println("The Greatest Number is : "+c);
        //Unary
        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println(++a);
        a--;
        System.out.println(a);
        System.out.println(--a);
        //Bitwise
        System.out.println("Bitwise And : "+(a&b));
        System.out.println("Bitwise Or : "+(a|b));
        System.out.println("Bitwise Xor : "+(a^b));
        System.out.println("Bitwise Not : "+(~a));
        // Left Shift (<<)
        int result1 = a << 2;
                System.out.println("Left Shift (3<< 2): " + result1);
        // Signed Right Shift (>>)
        int result2 = b >> 2;
               System.out.println("Signed Right Shift (6 >> 2): " + result2);
        // Unsigned Right Shift (>>>)
        int num=12;
        int result4 = num >>> 2;
        System.out.println("Unsigned Right Shift ( 12 >>> 2): " + result4);
    }
}
