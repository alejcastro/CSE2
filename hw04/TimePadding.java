///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// lab03
//BigMac Program
// this program will compute the cost of buying BigMacs. this will compute the co
//cost per big mac, and the percentage tax. this wil depend on the state and 
//finally the total cost. we will use the scanner class to accomplish it.
//for using the scanner this should be the first statement in your program
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class TimePadding {
    //main method 
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print(
            "Enter the number of Big Macs(an integer > 0): "); //this will allow the user
        //to enter the number of BigMacs
        // accept user input with the following statement
        double nCourse, semester;
        int year; // this command tell the computer
        if (myScanner.hasNextInt()) {
            nCourse = myScanner.nextInt();
            
            year = (int)((nCourse) / 100);
            semester = ((nCourse / 100.0) - year);
            
            semester=semester*100.0;
            
            semester=(int)(semester+.5);
            //semester = ((int)(semester) * 10) / 10.0;
            

            //System.out.println("You ordered "+nBigMacs+" for $2.22 each giving a total cost of "+nBigMacs*2.22+" dollars" );

        }
        else {
            System.out.println("You did not enter an int");
            return; //leaves the program, i.e.
            //the program terminates
        }
        if (nCourse > 186510 && nCourse < 201440) {
            if (semester == 10 || semester == 20 || semester == 30 || semester == 40) {
                if (semester == 10) {
                    System.out.println("the course was offered in spring the year " + year + " ");
                }
                if (semester == 20) {
                    System.out.println("the course was offered in summer 1 the year " + year + " ");
                }
                if (semester == 30) {
                    System.out.println("the course was offered in summer 2 the year " + year + " ");
                }
                if (semester == 40) {
                    System.out.println("the course was offered in fall the year " + year + " ");
                }
            }
            else
                System.out.println(" " + semester  + "is not a legitimate semester");
        }
        else {
            System.out.println("enter a number between 186510 and 201440");
        }
    }
}
