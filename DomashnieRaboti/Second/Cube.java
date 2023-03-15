package DomashnieRaboti.Second;

import java.util.Scanner;

public class Cube {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int counter = 0;
        int cubeNumber = 0;
        String s;
        for(s = sc.next(); !s.equals("STOP"); s = sc.next()){
            if ((!s.equals("aaaa")) | (s.equals("then"))) {
                counter += 1;
                if (s.equals("Cube")) {
                    cubeNumber = counter;
                }
            }
        }
        System.out.println(cubeNumber);
    }
}
