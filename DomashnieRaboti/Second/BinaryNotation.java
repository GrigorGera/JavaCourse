package DomashnieRaboti.Second;

import java.util.Scanner;

public class BinaryNotation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        String binaryOutput = "";
        while (N > 0) {
            if (N % 2 == 0) {
                binaryOutput += "0";
            } else {
                binaryOutput += "1";
            }
            N /= 2;
        }
        System.out.println(binaryOutput);
    }
}
