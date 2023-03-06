package Lab2;

import java.util.Scanner;

public class NomerSeven {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int summ = x;
        while (summ < n) {
            summ += x;
        }
        System.out.println(summ);
    }
}
