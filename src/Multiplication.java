import java.util.*;

/**
 * Main goals of this test: Pick two random numbers from the array, display
 * them to the user and take the user input on the answer.
 * Correct answer displays correct and displays next two random number.
 * Incorrect answer displays incorrect and asks for input again.
 */
public class Multiplication {

    // select random two numbers from array parameter
    private static int[] pickRandomTwoNums() {
        int[] array = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        List<Integer> list = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.shuffle(list);

        int[] answer = new int[2];
        for (int i = 0; i < 2; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }

    // print intro
    private static void printIntro() {
        System.out.println("WELCOME TO TRY MULTIPLY!\n");
        System.out.println("Enter 9999 to quit the application");
        System.out.println("Hone your multiplication skills! GOOD LUCK!!");
    }

    public static void main(String[] args) {
        int digit1 = 0;
        int digit2 = 0;

        printIntro();

        while(true) {
            int[] randomPicks = pickRandomTwoNums();
            for (int i = 0; i < randomPicks.length; i++) {
                digit1 = randomPicks[0];
                digit2 = randomPicks[1];
            }
            //        System.out.println(Arrays.toString(randomPicks) + "\n");

            System.out.println("What is " + digit1 + " x " + digit2 + "?");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your answer: ");

            int userAnswer = scanner.nextInt();

            if (userAnswer == 9999) {
                System.out.println("Thanks for playing! Bye Bye!");
                Runtime.getRuntime().exit(0);
            }if (userAnswer != digit1 * digit2) {
                System.out.println("Das wrong");
                System.out.println("The right answer is: " + digit1 * digit2);
            } else {
                System.out.println("Das right");
            }
        }
    }



}
