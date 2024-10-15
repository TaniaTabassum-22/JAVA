public class DataReturnType {

    // Returns an integer
    public static int getInt() {
        return 42;
    }

    // Returns a double
    public static double getDouble() {
        return 99.99;
    }

    // Returns a boolean
    public static boolean getBoolean() {
        return false;
    }

    // Returns a char
    public static char getChar() {
        return 'A';
    }

    // Returns a String
    public static String getString() {
        return "Tania Tabassum";
    }

    // Returns a long
    public static long getLong() {
        return 123456789L;
    }

    // Returns a float
    public static float getFloat() {
        return 15.75f;
    }

    // Returns a short
    public static short getShort() {
        return 32000;
    }

    public static void main(String[] args) {
        
        System.out.println("Integer: " + DataReturnType.getInt());
        System.out.println("Double: " + DataReturnType.getDouble());
        System.out.println("Boolean: " + DataReturnType.getBoolean());
        System.out.println("Char: " + DataReturnType.getChar());
        System.out.println("String: " + DataReturnType.getString());
        System.out.println("Long: " + DataReturnType.getLong());
        System.out.println("Float: " + DataReturnType.getFloat());
        System.out.println("Short: " + DataReturnType.getShort());
    }
}
