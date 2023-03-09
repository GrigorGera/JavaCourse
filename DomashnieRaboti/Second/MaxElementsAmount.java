package DomashnieRaboti.Second;

import java.util.Scanner;

public class MaxElementsAmount {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int input = sc.nextInt();
        int maxElement = 0;
        int maxElementCounter = 0;
        while (input != 0) {
            if (input > maxElement) {
                maxElementCounter = 1;
                maxElement = input;
            } else {
                if (input == maxElement) {
                    maxElementCounter += 1;
                }
            }
            input = sc.nextInt();
        }
        System.out.println("--------------------");
        System.out.println(maxElementCounter);
    }
}
