package Lab2;
import java.util.Scanner;

public class Vvod {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a = sc.nextDouble();
        int counter = 0;
        double summ = 0;
        while (a != 0) {
            counter += 1;
            summ += a;
            a = sc.nextDouble();
        }
        double s = summ / counter;
        System.out.println(s);
    }
    
}
