public class MathFunc {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public double add(double a,double b,double c){
        return a+b+c;
    }
    public int multiply(int a,int b,int c){
        return a*b*c;
    }
    public double multiply(double a,double b,double c){
        return a*b*c;
    }
    public int absolute(int a){
        return Math.abs(a);
    }
    public double ceil(double a){
        return Math.ceil(a);
    }
    public double floor(double a){
        return Math.floor(a);
    }
    public double round(double a){
        return Math.round(a);
    }
    public int maximum(int a,int b){
        return Math.max(a, b);
    }
    public double sqrt(double b){
        return Math.sqrt(b);
    }
    public double power(double a,double b){
        return Math.pow(a, b);
    }
    public double logarithm(double a){
        return Math.log(a);
    }
    public static void main(String args[]){
        MathFunc math=new MathFunc();
        //adding
        System.out.println("Add integers(3,5): "+math.add(3,5));
        System.out.println("Add integers(3,5,4): "+math.add(3,5,4));
        System.out.println("Add Doubles(3.4,5.6): "+math.add(3.4,5.6));
        System.out.println("Add Doubles (3.5,5.6,7.75): "+math.add(3.5,5.6,7.75));
        //multiply
        System.out.println("Add integers(3,5,4): "+math.multiply(3,5,4));
        System.out.println("Add Doubles (3.5,5.6,7.75): "+math.multiply(3.5,5.6,7.75));
        //abs
        System.out.println("Absolute is(-45): "+math.absolute(-45));
        //ceil
        System.out.println("Ceil value is(3.455): "+math.ceil(3.455));
        //floor
        System.out.println("Floor values is(2.455): "+math.floor(2.455));
        //round
        System.out.println("Round of(5.450): "+math.round(5.450));
        // max
        System.out.println("Maximum of 10 and 20: " + math.maximum(10, 20));
        // sqrt
        System.out.println("Square root of 25: " + math.sqrt(25));
        // power
        System.out.println("power (2,3): " + math.power(2, 3));
        //log
        System.out.println("Logarithm of 2.718: " + math.logarithm(2.718));
    }
}
