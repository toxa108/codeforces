package test;

public class Test2 {
    static void doCalc(byte... a) {
        System.out.print("byte...");
    }
    static void doCalc(byte a, byte b) {
        System.out.print("byte, byte");
    }
    static void doCalc(long a) {
        System.out.print("long");
    }
    static void doCalc(long a, long b) {
        System.out.print("long, long");
    }
    static void doCalc(Byte s1, Byte s2) {
        System.out.print("Byte, Byte");
    }
    public static void main (String[] args) {
        byte b = 5;
        doCalc(b);
    }
}