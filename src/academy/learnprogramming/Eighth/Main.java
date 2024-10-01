package academy.learnprogramming.Eighth;

public class Main {

    public static void main(String[] args) {
        System.out.printf("byte min: %d, byte max: %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE );
        System.out.printf("short min: %d, short max: %d%n", Short.MIN_VALUE, Short.MAX_VALUE );
        System.out.printf("int min: %d, int max: %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE );
        System.out.printf("long min: %d, long max: %d%n", Long.MIN_VALUE, Long.MAX_VALUE );
        System.out.printf("float min: %s, float max: %s%n", Float.MIN_VALUE, Float.MAX_VALUE );
        System.out.printf("double min: %s, double max: %s", Double.MIN_VALUE, Double.MAX_VALUE );

        System.out.printf("float minimum= %s, maximum= %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double minimum= %s, maximum= %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

        float f = 123.456789012345678f;
        double d = 123.456789012345678;
        System.out.printf("f is %.99f %n", f);
        System.out.printf("d is %.99f %n", d);
        System.out.println("f is " + f);
        System.out.println("d is " + d);

    }

}
