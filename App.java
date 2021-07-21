import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int answer = r.nextInt(101);

        System.out.print("Guess a number between 1 and 100: ");

        for (int i = 0; i < 5; i++) {

            int number = scanner.nextInt();

            if ((Math.abs(number - answer)) > 10) {
                System.out.println();
                System.out.print("Wrong answer, try again: ");
                continue;
            } else {
                System.out.println("The correct answer was: " + answer);
                scanner.close();
                System.exit(0);
            }
        }

        System.out.println("Sorry, the answer was " + answer);

        scanner.close();

    }
}