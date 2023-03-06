package Lab2;

import java.util.Scanner;

public class NomerTen {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        String output = "*";
        String spaces = "";
        for (var i = 1; i <= n; i++) {
            for (var j = n; j > i; j--) {
                spaces += " ";
            }
            System.out.println(spaces + output);
            output += "**";
            spaces = "";
        }
    }
    
}
