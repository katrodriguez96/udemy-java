package section4;

public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // methods challenge
        String playersName = "Kat";
        int scoreOne = calculateHighScorePosition(1500);
        int scoreTwo = calculateHighScorePosition(900);
        int scoreThree = calculateHighScorePosition(400);
        int scoreFour = calculateHighScorePosition(50);
        displayHighScorePosition(playersName, scoreOne);
        displayHighScorePosition(playersName, scoreTwo);
        displayHighScorePosition(playersName, scoreThree);
        displayHighScorePosition(playersName, scoreFour);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playersName, int scorePosition) {
        System.out.println(playersName + " managed to get into position " + scorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
