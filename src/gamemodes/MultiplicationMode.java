package gamemodes;

import java.util.*;
/**
 * Class MultiplicationMode handles all methods related to
 * multiplication game.
 *
 */

public class MultiplicationMode {

    // select random two numbers from array parameter
    public static int[] pickRandomTwoNums() {
        int[] array = { 1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

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

    public static void askMultiplyQuestion(int firstNum, int secondNum) {
        System.out.println("What is " + firstNum + " x " + secondNum + "?");

    }



}
