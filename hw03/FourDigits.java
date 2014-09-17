//////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// hw03
//Four Digits Program
// this program will compute the first four decimal places of a number inserted by
// the user for accomplishing it we will use a scanner to read the number inserted
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class FourDigits{
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
// this will let the user enter his number for the program to read and reply the
// first 4 decimal places

System.out.print("Enter a double and i display the 4 digits right to the decimal place: ");//this will allow the user to 
 // to enter the number   
double number= myScanner.nextDouble();// we named "number" the user's number
double number1,number2;// we establish our variables as doubles to get the decimals
number1=(int)(number);// we create another variable to eliminate de decimals this 
// way we can subtract it from the user's number and get just the decimal places
number2=(number-number1);// now we subtract number1 to number so we can get just the decimals
// print the value
System.out.println("the first 4 decimal places are " +((int)(number2*10000)/10000.0)+" of the number");
// we multiplied by a 10000 and divide it by 10000.0 to get just 4 decimal places we need

}//end of main methd
}// end of class

