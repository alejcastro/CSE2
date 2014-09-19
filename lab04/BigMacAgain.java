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
public class BigMacAgain {
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
System.out.print (
"Enter the number of Big Macs(an integer > 0): ");//this will allow the user
//to enter the number of BigMacs
// accept user input with the following statement
int nBigMacs;// this command tell the computer
if(myScanner.hasNextInt())
{
    nBigMacs= myScanner.nextInt();

 //System.out.println("You ordered "+nBigMacs+" for $2.22 each giving a total cost of "+nBigMacs*2.22+" dollars" );
 
}
else{
    System.out.println("You did not enter an int");
  return;    //leaves the program, i.e.
                //the program terminates
}
if(nBigMacs>0)
{
System.out.println("You ordered "+nBigMacs+" for $2.22 each giving a total cost of "+nBigMacs*2.22+" dollars" );
}

else{System.out.println("You did not enter an int greater than 0");
  return;    //leaves the program, i.e.
                //the program terminates
}

System.out.print (
"You want   French fries(Y,y,N,n): ");    
String frenchFries;// this command tell the computer
double pFrenchFries=0.0;
if(myScanner.hasNext())
{
    frenchFries= myScanner.next();

    
}
else{
    System.out.println("You did not enter an int");
  return;    //leaves the program, i.e.
                //the program terminates
}
if(frenchFries.equals("Y")||frenchFries.equals("y")||frenchFries.equals("N")||frenchFries.equals("n"))
{
    
    if(frenchFries.equals("Y")||frenchFries.equals("y"))
 {    
     pFrenchFries=2.43;
    System.out.println("Your cost for french Fries is $2.43 dollars");
 }
}
else{
    System.out.println("You did not enter an int of N,n,Y, or y");
  return;    //leaves the program, i.e.
                //the program terminates
}
System.out.println("The total cost of the meal is "+((int)((nBigMacs*2.22+pFrenchFries)*100)/100.0+ " dollars have a good day"));
}
}



//that scanner has the next int