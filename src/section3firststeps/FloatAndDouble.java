package section3firststeps;

public class FloatAndDouble {
    public static void main(String[] args) {
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum float value: " + minFloatValue);
        System.out.println("Maximum float value: " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum double value: " + minDoubleValue);
        System.out.println("Maximum double value: " + maxDoubleValue);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5.00 / 3.00;

        // floating point precision and a challenge
        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        double pounds = 5;
        double kilograms = 0.45359237 * pounds;
        System.out.println("kilograms = " + kilograms);
    }
}
