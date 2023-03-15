package Lab3;

import java.util.Scanner;

public class First {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] * k);
        }
    }
}
