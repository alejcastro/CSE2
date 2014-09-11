///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// lab03
//BigMac Program
// this program will compute the cost of buying BigMacs. this will compute the co
//cost per big mac, and the percentage tax. this wil depend on the state and 
//finally the total cost. we will use the scanner class to accomplish it.
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class BigMac {
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
System.out.print (
"Enter the number of Big Macs(an integer > 0): ");//this will allow the user
//to enter the number of BigMacs
// accept user input with the following statement
int nBigMacs= myScanner.nextInt();// this command tell the computer
//that scanner has the next int
System.out.print("Enter the cost per Big Mac as"+
    "a double (in the form xx.xx): ");//this will allow the user to 
    //enter the cost per big mac
double bigMac$ = myScanner.nextDouble();
System.out.print(
    "Enter the percent tax as a whole number (xx): ");// this will allow
    // the user to enter the tax rate
double taxRate = myScanner.nextDouble();// this tell the computer to find 
// taxRate on my scanner

taxRate/=100; //user enters percent, but I want
  //proportion
  //print out the output
 double cost$;
int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
cost$ = nBigMacs*bigMac$*(1+taxRate);
//get the whole amount, dropping decimal fraction
dollars=(int)cost$;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
// this next two lines will help with the decimal points of the price
dimes=(int)(cost$*10)%10;// decimal point to the 10th
pennies=(int)(cost$*100)%10;// decimal point to the 100th
//print the final price
System.out.println("The total cost of " +nBigMacs
 +" BigMacs, at $"+bigMac$ +" per bigMac, with a"+
 " sales tax of "+ (int)(taxRate*100) +"%,is $"
 +dollars+'.'+dimes+pennies); 
}
}
//end of class
