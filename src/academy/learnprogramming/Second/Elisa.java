package academy.learnprogramming.Second;

import java.util.Scanner;

public class Elisa {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println(Doctor.intro());
        var userInput = scanner.nextLine();

        while(!userInput.equalsIgnoreCase("quit")) {

            userInput = scanner.nextLine();

            String response = Doctor.response(userInput);
            System.out.println(response);
        }
        scanner.close();
    }

}
