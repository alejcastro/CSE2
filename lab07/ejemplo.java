import java.util.Scanner;
//define class
public class ejemplo {
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print(
            "enter an integer from   ");
        double x;
        double m=0;
        if (myScanner.hasNextDouble()) // if the user enter an integer
        {
            x = myScanner.nextDouble(); //then income is  the int the user enter
        }
        else {
            System.out.println("You did not enter an double"); // if not exit the program
            return; //leaves the progtam, i.e.
        }


         double tolerance = 0.0000001;
        double low, high;

        low = 0;
        high = 1 + x;
        m = (low + high) / 2;
            if ((m * m) > x) {
                high = m;
            }
            else {
                low = m;
            }

        while ((high - low) < (tolerance * (1 + x))) {
            m = (low + high) / 2;
            if ((m * m) > x) {
                high = m;
            }
            else {
                low = m;
            }
        }



        System.out.println("Approximate solution = " + m);
    }
}