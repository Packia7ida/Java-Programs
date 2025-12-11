public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("--- Implicit Type Casting (Widening) ---");
        int intVal = 42;
        long longVal = intVal; // int to long
        float floatVal = longVal; // long to float
        double doubleVal = floatVal; // float to double
        System.out.println("int value: " + intVal);
        System.out.println("long value: " + longVal);
        System.out.println("float value: " + floatVal);
        System.out.println("double value: " + doubleVal);

        System.out.println("\n--- Explicit Type Casting (Narrowing) ---");
        double originalDouble = 42.99;
        float narrowedFloat = (float) originalDouble; // double to float
        long narrowedLong = (long) narrowedFloat; // float to long
        int narrowedInt = (int) narrowedLong; // long to int
        char charVal = (char) narrowedInt; // int to char
        System.out.println("original double: " + originalDouble);
        System.out.println("narrowed to float: " + narrowedFloat);
        System.out.println("narrowed to long: " + narrowedLong);
        System.out.println("narrowed to int: " + narrowedInt);
        System.out.println("narrowed to char: " + charVal);

        System.out.println("\n--- Casting with Non-Primitive Types ---");
//        Object obj = "Hello, World!"; // Upcasting (implicit)
//        String str = (String) obj; // Downcasting (explicit)
        String str = "Hello, World!"; // Upcasting (implicit)
        Object obj = str;
        System.out.println("Object: " + obj);
        System.out.println("String: " + str);

        System.out.println("\n--- Type Casting in Arithmetic Operations ---");
        byte byteVal = 10;
        short shortVal = 20;
        int result = byteVal + shortVal; // byte and short are implicitly cast to int during arithmetic
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("result (int): " + result);

        // Casting a Larger Primitive Type into a Smaller Type
        System.out.println("\n--- Handling Overflow in Explicit Casting ---");
        int largeInt = 130;
        byte overflowByte = (byte) largeInt; // Overflow occurs
        System.out.println("Original int: " + largeInt);
        System.out.println("After casting to byte: " + overflowByte);
    }
}

