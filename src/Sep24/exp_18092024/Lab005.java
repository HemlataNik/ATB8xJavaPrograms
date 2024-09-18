package Sep24.exp_18092024;

public class Lab005 {
    public static void main(String[] args){
        // Type Casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b = 10;
        int a = b; // Valid - Implicit Casting - JVM
        int a1 = (int)b; // Valid - Explicit Casting - JVM

        // Narrowing
        int val = 200;
        //byte b1 = val; // Invalid Implicit Casting - JVM
        byte b2 = (byte)val; // Invalid Explicit Casting - Loss of data.
        System.out.println(b2);
//example
        long phone_no = 9876543210l;
        //short s = phone_no; // Narrowing - Implicit - JVM // Invalid
        short s1 = (short)phone_no; // Narrowing - Explicit - Loss // Invalid
    }
}
