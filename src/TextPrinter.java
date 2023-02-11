/**
 * Class TextPrinter contains all methods that print
 * the output text.
 *
 */

public class TextPrinter {
    public static void printIntro() {
        System.out.println("WELCOME TO MATH FUN...damentals!\n");
        System.out.println("Enter 9999 to quit the application");
        System.out.println("Hone your math skills! GOOD LUCK!!");
    }

    public static void exitGame() {
        System.out.println("Thanks for playing! Bye Bye!");
        Runtime.getRuntime().exit(0);
    }

    public static void wrongAnswer(int answer) {
        System.out.println("Das wrong");
        System.out.println("The right answer is: " + answer);
    }

    public static void rightAnswer() {
        System.out.println("Correct!");
    }
}
