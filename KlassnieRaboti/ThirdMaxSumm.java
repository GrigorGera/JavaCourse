package KlassnieRaboti;

import java.util.Scanner;
//import java.util.Arrays;

public class ThirdMaxSumm {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = 0;
        int lineSumm;
        int maxSumm = -1000;
        int maxLine = 0;
        int maxK = 0;
        int [][] workArray = new int[n][];
        

        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            lineSumm = 0;
            for (int j = 0; j < k; j++) {
                workArray[i][j] = sc.nextInt();
                lineSumm += workArray[i][j];
            }
            if (lineSumm > maxSumm) {
                maxLine = i;
                maxSumm = lineSumm;
                maxK = k;
            }
        }
        System.out.println(maxLine);
        System.out.println(maxSumm);
        for (int i = 0; i < maxK; i++) {
            System.out.print(workArray[maxLine][i] + " ");
        }
    }
}
