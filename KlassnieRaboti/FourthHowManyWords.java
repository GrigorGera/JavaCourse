package KlassnieRaboti;

import java.util.Scanner;

public class FourthHowManyWords {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String MashasFavouriteLetter = sc.nextLine();
        String OlegsFavouriteLetter = sc.nextLine();
        String [] inputString = sc.nextLine().toLowerCase().split(" ");
        int MashasWordsCounter = 0;
        int OlegsWordsCounter = 0;
        for (int i = 0; i < inputString.length; i++) {
            if (inputString[i].startsWith(MashasFavouriteLetter) && inputString[i].endsWith(OlegsFavouriteLetter)) {
                MashasWordsCounter++;
            }
            if (inputString[i].startsWith(OlegsFavouriteLetter) && inputString[i].endsWith(MashasFavouriteLetter)) {
                OlegsWordsCounter++;
            }
        }
        System.out.println(MashasWordsCounter);
        System.out.println(OlegsWordsCounter);
    }
}
