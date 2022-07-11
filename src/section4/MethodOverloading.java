package section4;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Kat", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        // challenge
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(72);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0) {
            System.out.println("Invalid feet value");
            return -1;
        } else if (inches < 0 || inches > 12) {
            System.out.println("Invalid inches value");
            return -1;
        }
        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches value");
            return -1;
        }
        double feet = inches / 12;
        inches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
