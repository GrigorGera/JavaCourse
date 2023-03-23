package DomashnieRaboti.StrokiRAR;

import java.util.Scanner;

public class zamena {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String forbiddenIngredient = sc.nextLine();
        String forbiddenIngredientReplacement = sc.nextLine();
        String cookingBook = sc.nextLine();
        System.out.println(cookingBook.replace(forbiddenIngredient, forbiddenIngredientReplacement));
    }
}
