import java.util.*;

import gamemodes.MultiplicationMode;

/**
 * Class RunGame handles game flow.
 *
 * This test game tests out the logic of a planned
 * basic math game, including user inputs, application outputs,
 * and overall logic.
 *
 */
public class RunGame {

    public static void main(String[] args) {
        int digit1 = 0;
        int digit2 = 0;
        boolean gameIsRunning = true;

        TextPrinter.printIntro();

        while(gameIsRunning) {
            int[] randomPicks = MultiplicationMode.pickRandomTwoNums();
            for (int i = 0; i < randomPicks.length; i++) {
                digit1 = randomPicks[0];
                digit2 = randomPicks[1];
            }
//            System.out.println(Arrays.toString(randomPicks) + "\n"); //DEBUG

            MultiplicationMode.askMultiplyQuestion(digit1, digit2);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your answer: ");

            int userAnswer = scanner.nextInt();

            if (userAnswer == 9999) {
                gameIsRunning = false;
                TextPrinter.exitGame();
            } if (userAnswer != digit1 * digit2) {
               TextPrinter.wrongAnswer(digit1 * digit2);
            } else {
                TextPrinter.rightAnswer();
            }
        }
    }



}
