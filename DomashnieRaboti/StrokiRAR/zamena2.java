// package DomashnieRaboti.StrokiRAR;

// import java.util.Scanner;

// public class zamena2 {
//     static Scanner sc = new Scanner(System.in);
//     public static void main(String[] args) {
//         int n = sc.nextInt();
//         String [] cookingBook = new String [n];
//         for (int i = 0; i < n; i++) {
//             cookingBook[i] = sc.nextLine();
//         }

//         int m = sc.nextInt();
//         for (int i = 0; i < m; i++) {
//             String [] forbiddenIngredientsAndReplacments = sc.nextLine().split("\\w+");
//             String forbiddenIngredient = forbiddenIngredientsAndReplacments[1];
//             String forbiddenIngredientReplacement = forbiddenIngredientsAndReplacments[2];
//             cookingBook = cookingBook.replace(forbiddenIngredient, forbiddenIngredientReplacement);
//         }
//     }
// }
