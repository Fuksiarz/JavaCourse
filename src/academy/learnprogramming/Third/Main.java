package academy.learnprogramming.Third;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random randomGenerator = new Random();

        int firstNumber = randomGenerator.nextInt(8) + 2;
        int secondNumber = randomGenerator.nextInt(8) + 2;

        var subtraction = randomGenerator.nextInt(8) + 2;
        int answer = firstNumber * secondNumber - subtraction;


        String prompt =". Dont type in the answer, just press ENTER when ready";
        System.out.println("think of a number between 1 and 10" + prompt);
        scanner.nextLine();
        System.out.println("Multiply your number by " + firstNumber + prompt);
        scanner.nextLine();
        System.out.println("Now Multiply your number by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Divide the result by the number you originally thought of  " + prompt);
        scanner.nextLine();
        System.out.println("Now subtract  " + subtraction + prompt);
        scanner.nextLine();


        System.out.println("The answer is " + answer);

        scanner.close();
    }
}
