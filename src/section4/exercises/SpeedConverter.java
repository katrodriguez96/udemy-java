package section4.exercises;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args) {
        System.out.println("toMilesPerHour(1.5) = " + toMilesPerHour(1.5));
        System.out.println("toMilesPerHour(10.25) = " + toMilesPerHour(10.25));
        System.out.println("toMilesPerHour(-5.6) = " + toMilesPerHour(-5.6));
        System.out.println("toMilesPerHour(25.42) = " + toMilesPerHour(25.42));
        System.out.println("toMilesPerHour(75.114) = " + toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
