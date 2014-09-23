///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
//CourseNumber
// hw04
//this program will allow the user to enter a six digit number which first 4 numbers will
//tell the year and last 2  semester(10=spring 20=summer1 30=summer2 40=fall)
//for using the scanner this should be the first statement in your program
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class CourseNumber{
//main method 
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print(
 "Enter a six digit number that will determine the semester: "); //this will allow the user
        //to enter the number of the semester
        // accept user input with the following statement
        // this will initialize the doubles nCourse and semmester
        double nCourse, semester;
        // this will initialize the integer year
        int year; // this command tell the computer
        // we have to make sure the user enter an integer
        if (myScanner.hasNextInt()) {
            //this will give nCourse the value the user input
            nCourse = myScanner.nextInt();
            //we cast the double nCourse to make it an integer and divide it by
            //100 to get just the first 4 numbers 
            year = (int)((nCourse) / 100);
            //we subtract from the double nCourse the integer year to get the last 2 digits
            semester = ((nCourse / 100.0) - year);
            // we multiplied the last to digits by a 100 for making it a whole number again
            //we multiplied it by a 100.0 to get exactly the decimal points we want
            semester=semester*100.0;
            //we had a problem with the rounding of numbers therefore we cast semester and add it .5 
            //to round every number
            semester=(int)(semester+.5);
           
            

            
        }
        // if the user did not enter an integer this wil be trigger
        else {
            System.out.println("You did not enter an int");
            return; //leaves the program, i.e.
            //the program terminates
        // we have to make sure the user enter a number between 186510 and 201440 
        // becuase is the year the school start and the current semester respectively
        }
        if (nCourse > 186510 && nCourse < 201440) {
            // we define the diffent types of semesters
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
            // if the user did not enter any of this 2 numbers as their last digit than this will be applied
            else
                System.out.println(" " + semester  + "is not a legitimate semester");
        }
        else {
            System.out.println("enter a number between 186510 and 201440");
        }
    }
}
