package section4.exercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 *= 1000;
        num2 *= 1000;

        int int1 = (int) num1;
        int int2 = (int) num2;

        return int1 == int2;
    }

    public static void main(String[] args) {
        System.out.println("areEqualByThreeDecimalPlaces(-3.1756, -3.175) = " + areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("areEqualByThreeDecimalPlaces(3.175, 3.176) = " + areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("areEqualByThreeDecimalPlaces(3.0, 3.0) = " + areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("areEqualByThreeDecimalPlaces(-3.123, 3.123) = " + areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
