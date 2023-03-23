package KlassnieRaboti;

import java.util.Scanner;

public class FourthIsThisANumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char c = sc.next().charAt(0);
        System.out.println(c >= '0' && c <= '9'? "yes" : "no");
    }
}
