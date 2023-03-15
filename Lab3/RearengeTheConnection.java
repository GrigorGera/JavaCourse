package Lab3;

import java.util.Scanner;

public class RearengeTheConnection {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int [] array = new int[N];
        int replaser;
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        if (N % 2 != 0) {
            N -= 1;
            flag = true;
        }
        for (int i = 0; i < N; i += 2) {
            replaser = array[i];
            array[i] = array[i + 1];
            array[i + 1] = replaser;
        }
        System.out.println("---------------------");
        if (flag) {
            N += 1;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(array[i]);
        }
    }
}
