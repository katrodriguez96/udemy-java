package section3firststeps;

public class Operators {
    public static void main(String[] args) {
        int result = 1 +2; // 1 + 2 = 3
        System.out.println("result = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result -1; // 3 - 1 = 2
        System.out.println("result = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("result = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("result = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("result = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("result = " + result);

        result--; // 2 - 1 = 1
        System.out.println("result = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("result = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("result = " + result);

        // result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("result = " + result);

        // result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("result = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien.");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // operator challenge
        double doubleOne = 20.00;
        double doubleTwo = 80.00;
        double doubleResult = (doubleOne + doubleTwo) * 100.00;
        System.out.println("doubleResult = " + doubleResult);
        double remainder = doubleResult % 40.00;
        System.out.println("remainder = " + remainder);
        boolean isZero = remainder == 0 ? true : false;
        System.out.println("isZero = " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder.");
        }
    }
}
