package section4.exercises;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("isLeapYear(-1600) = " + isLeapYear(-1600));
        System.out.println("isLeapYear(1600) = " + isLeapYear(1600));
        System.out.println("isLeapYear(2017) = " + isLeapYear(2017));
        System.out.println("isLeapYear(2000) = " + isLeapYear(2000));
    }
}
