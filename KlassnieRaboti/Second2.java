package KlassnieRaboti;

// import java.util.Scanner;

// public class Second2 {
//     static Scanner sc = new Scanner(System.in);
//     public static void main(String[] args) {
//         String input;
//         int p = 1;
//         boolean flag = false;
//         for (var s = sc.next(); !s.equals("СТОП"); s = sc.next()) {
//             int a = Integer.parseInt(s);
//             if (a != 0) {
//                 p *= a;
//                 flag = true;
//             }
//         }
//         System.out.println(flag ? p: "Не найдено");
//     }
// }

import java.util.Scanner;

class Second2{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean flag = false;
        int p = 1;
        String s;
        for(s = sc.next(); !s.equals("СТОП"); s = sc.next()){
            int a = Integer.parseInt(s);
            if(a != 0) {
                p *= a;
                flag = true;

            }
        }
        System.out.print(flag ? p : "Не найдено");

    }
}