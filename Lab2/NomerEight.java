package Lab2;

import java.util.Scanner;

public class NomerEight {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int counter = 0;
        int multiplication = 1;
        int reader = 0;
        if (n > 1) {
            while (multiplication < n) {
                reader = sc.nextInt();
                counter += 1;
                multiplication *= reader;
            }
        } else {
            reader = sc.nextInt();
            counter += 1;
            multiplication *= reader;
        }
        System.out.println("---------------------");
        System.out.println(counter + " " + multiplication);
    }
}
