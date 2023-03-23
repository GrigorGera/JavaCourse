package DomashnieRaboti.StrokiRAR;

import java.util.Scanner;

public class justConnectThem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        String [] components = new String[n];
        for (int i = 0; i < n; i++) {
            components[i] = sc.nextLine();
        }
        
        String divider = sc.nextLine();

        String outputString = "";
        for (int i = 0; i < n; i++) {
            outputString = outputString.concat(components[i]);
            if (i != n - 1) {
                outputString = outputString.concat(divider);
            }
        }

        System.out.println(outputString);
    }
}
