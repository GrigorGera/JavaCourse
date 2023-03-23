package KlassnieRaboti;

import java.util.Scanner;

public class Fourth1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        
        System.out.println(str.charAt(2));
        
        System.out.println(str.charAt(str.length() - 2));
        
        char [] firstFive = new char [5];
        str.getChars(0, 5, firstFive, 0);
        System.out.println(firstFive);
        
        char [] exeptLastTwo = new char [str.length() - 2];
        str.getChars(0, str.length() - 2, exeptLastTwo, 0);
        System.out.println(exeptLastTwo);

        char [] fromFourthToEnd = new char [str.length()];
        str.getChars(3, str.length(), fromFourthToEnd, 0);
        System.out.println(fromFourthToEnd);
    }
}
