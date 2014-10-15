import java.util.Scanner;
//define class
public class Root {
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print(
            "enter an integer greater than 0   ");
        double x;
        double m = 0;
        double m1 = 0;
        if (myScanner.hasNextDouble()) // if the user enter an integer
        {
            x = myScanner.nextDouble(); //then the number x  is  the int the user enter
        }
        else {
            System.out.println("You did not enter an double"); // if not exit the program
            return; //leaves the program, i.e.
        }
        if (x < 0) { //if the user did not enter an int greater than 0
            System.out.println("You did not enter a number greater than 0"); // if not exit the program
            return; //leaves the progtam, i.e.

        }


        double tolerance = 0.0000001; // this will help us stop the program
        double low, high;

        low = 0; // initialize the 2 variables
        high = 1 + x;


        while ((high - low) > (tolerance * (1 + x))) { //while the difference betweeen difference 
            //high and low is less than some small multiple of 1+x, say 0.0000001*(1+x)
            m = (low + high) / 2; // the midpoint
            if ((m * m) > x) { //  If the square of middle is greater than x, 
                //then change high to middle; otherwise change low to middle.
                high = m;
            }
            else {
                low = m;
            }
        }


// print the aproximated value
        System.out.println("Approximate solution is  = " + m);
    }
}