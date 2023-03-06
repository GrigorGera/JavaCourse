package Lab2;
import java.util.Scanner;

public class NomerSix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int reader = sc.nextInt();
        int summ = 0;
        while (reader != 0) {
            summ += reader;
            reader = sc.nextInt();
        }
        System.out.println(summ);
    }
}
