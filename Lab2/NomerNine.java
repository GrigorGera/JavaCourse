package Lab2;

import java.util.Scanner;

public class NomerNine {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        String output = "*";
        for (var i = 1; i <= n; i++) {
            System.out.println(output);
            output += "*";
        }
    }
}
