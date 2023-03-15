package Lab3;

import java.util.Scanner;

public class Second {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int summ = 0;
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            summ += a[i];
        }
        System.out.println("------------");
        System.out.println(summ);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
