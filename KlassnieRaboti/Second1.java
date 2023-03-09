package KlassnieRaboti;

import java.util.Scanner;

public class Second1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int summ = 0;
        for (int i = sc.nextInt(); true; i = sc.nextInt()) {
            if (i % 7 == 0) {
                break;
            } else {
                if (i % 10 == 7) {
                    summ += i;
                }
            }
        }
        System.out.println(summ);
    }
}
