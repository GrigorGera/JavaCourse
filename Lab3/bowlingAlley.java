package Lab3;

import java.util.Scanner;

public class bowlingAlley {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a;
        int b;
        char [] pinArray = new char[N];
        for (int i = 0; i < N; i++) {
            pinArray[i] = 'I';
        }
        for (int i = 0; i < K; i++) {
            a = sc.nextInt();
            a = a - 1;
            b = sc.nextInt();
            b = b - 1;
            if ((0 <= a) & (a <= b) & (b <= N - 1)) {
                for (int j = a; j <= b; j++) {
                    pinArray[j] = '.';
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(pinArray[i]);
        }
    }
}
