package Lab2;
import java.util.Scanner;

public class MorningJog {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int counter = 1;
        while (x < y) {
            x = x * 1.1;
            counter += 1;
        }
        System.out.println(counter);
    }
}
