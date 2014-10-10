/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */



import java.util.Scanner;
public class Enigma0 {
    public static void main(String arg[]) {
        System.out.print("Enter an int- ");
        Scanner scan = new Scanner(System.in);
        int n;
        if (scan.hasNextInt()) {
            n = scan.nextInt();
            System.out.println("You entered " + n);
        }
        else {
             n = 4;
            System.out.println("You entered " + n);
        }

        int k = 4, p = 6, q = 7, r = 8;
        switch (k + p + q + r) {
            case 24:
            case 25:
                System.out.println("sum is 25");
            default:
                System.out.println("To repeat, you entered " + n);
        }
    }
}

/* Error report: 
scoop error: the variable n was initialize inside an if statement
also the the variable n was constanly initialize (int) in line 20 and 25
I erase the int  from both of them and initilize the variable outside the if statement to fix this program
the print said "to repeat" instead of "again"
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 */

