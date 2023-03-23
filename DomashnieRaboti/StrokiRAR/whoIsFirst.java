package DomashnieRaboti.StrokiRAR;

import java.util.Scanner;

public class whoIsFirst {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = sc.nextLine();
        String filter = sc.nextLine();
        System.out.println(input.indexOf(filter));
        System.out.println(input.lastIndexOf(filter));
    }
}
