/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3 {
    public static void main(String[] arg) {
        int n = 40, k = 60;
        String out = "";
        switch (k % 14) {
            case 12:
            case 13:
                out += 13;
                break;
            default:
                out += 40;
                n /= 3;
                k -= 7;
                System.out.println(n+"a, "+k);
                
        }
        if (n * k % 12 < 12) {
            n -= 20;
            out += n;
             System.out.println(n+"b, "+k);
            
        }
        if (n * n > k) {
            n = 42;
            out += n + k;
             System.out.println(n+"c, "+k);
        }
        else {
            n = 45;
            out += n + k;
             System.out.println(n+"d, "+k);
        }
        switch (n + k) {
            case 114:
                n -= 11;
                k -= 3;
                 System.out.println(n+"f, "+k);
                break;
                 
            case 97:
                n -= 14;
                k -= 2;
                 System.out.println(n+"g, "+k);
                break;
                 
            case 98:
                n /= 5;
                k /= 9;
                 System.out.println(n+"h, "+k);
            default:
                n -= 3;
                k -= 4;
                 System.out.println(n+"i, "+k);
        }
        out += 1 / n + 1 / k;
        System.out.println(out);
    }
}

/*
 * Error report:by using print statements i realized the error was in line 60 where k became 0
 what I did to solve it was changing the number 5 to any other number which will not be 0
 *
 *
 *
 *
 */
