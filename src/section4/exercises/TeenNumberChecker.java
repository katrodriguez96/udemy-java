package section4.exercises;

public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }

    public static void main(String[] args) {
        System.out.println("hasTeen(9, 99, 19) = " + hasTeen(9, 99, 19));
        System.out.println("hasTeen(23, 15, 42) = " + hasTeen(23, 15, 42));
        System.out.println("hasTeen(22, 23, 34) = " + hasTeen(22, 23, 34));

        System.out.println("isTeen(9) = " + isTeen(9));
        System.out.println("isTeen(13) = " + isTeen(13));
    }
}
