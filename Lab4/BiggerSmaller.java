package Lab4;

import java.util.Scanner;
import java.lang.Math;

public class BiggerSmaller {
    static Scanner sc = new Scanner(System.in);

    static int generateRandom() {
        int a = (int) (Math.random() * 100 + 1);
        return(a);
    }
    
    static void gamingProcess() {
        int randomNumber = generateRandom();
        int counter = 1;
        System.out.print("Guess a number between 1 and 100: ");
        int input = sc.nextInt();
        while (input != randomNumber) {
            counter += 1;

            if (input > randomNumber) {
                System.out.println(input + " is too high. Try again.");
            } else {
                System.out.println(input + " is too low. Try again.");
            }
            
            System.out.print("Guess a number between 1 and 100: ");
            input = sc.nextInt();
        }
        
        System.out.println(randomNumber + " is correct! You win!");
        System.out.println("It only took you " + counter + " tries! Good work!");
    }

    public static void main(String[] args) {
        String option = "y";
        while (!option.equals("n")) {
            gamingProcess();
            System.out.println("Would you like to play again? (y/n)");
            option = sc.next();
        }
    }
}
