package DomashnieRaboti.StrokiRAR;

import java.util.Scanner;

public class IP {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        boolean flag = true;
        String [] inputIp = sc.nextLine().split("\\.");
        for (byte i = 0; i < 4; i++) {
            short ipByte = Short.parseShort(inputIp[i]);
            if ((ipByte > 255) || (ipByte < 0)) {flag = false;}
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
