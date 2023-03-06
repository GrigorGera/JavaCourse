package Lab2;
import java.util.Scanner;

public class MinDelitel {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int input = sc.nextInt();
        for (var i = 2; i < input; i++) {
            if (input % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
