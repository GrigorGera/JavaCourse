package Lab2;
import java.util.Scanner;

public class Kolichestvo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int counter = 0;
        if (a <= b) {
            for (var i = a; i <= b; i++) {
                if ((i % 3 == 0) && (i % 5 != 0)) {
                    counter += 1;
                }
            }
            System.out.println(counter);
        }
    }
}
