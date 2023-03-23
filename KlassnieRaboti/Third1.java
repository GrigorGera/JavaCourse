package KlassnieRaboti;

import java.util.Scanner;

public class Third1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] multiplicationMatrix = new int [n][m];

        for (byte i = 1; i <= n; i++) {
            for (byte j = 1; j <= m; j++) {
                multiplicationMatrix[i-1][j-1] = i * j;
            }
        }
        
        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < m; j++) {
                System.out.print(multiplicationMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
