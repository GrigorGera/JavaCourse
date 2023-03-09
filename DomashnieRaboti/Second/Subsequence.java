package DomashnieRaboti.Second;

import java.util.Scanner;

public class Subsequence {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int negativeCounter = 0;
        int threeCounter = 0;
        int input = sc.nextInt();
        while (input != 0) {
            if (input % 3 == 0) {
                threeCounter += 1;
            }
            if (input < 0) {
                negativeCounter += 1;
            }
            input = sc.nextInt();
        }
        if (threeCounter > negativeCounter) {
            System.out.println("333");
        } else {
            if (negativeCounter > threeCounter) {
                System.out.println("negative");
            } else {
                System.out.println("Equal");
            }
        }
    }
}
