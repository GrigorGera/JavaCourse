package Lab2;
import java.util.Scanner;

public class IntSumm {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int summ = 0;
        while (N > 0) {
            summ += N % 10;
            N = N / 10;
        }
        System.out.print(summ);
    }
}
