//////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// lab03
//BigMac Program
// this program will compute the cost of buying BigMacs. this will compute the co
//cost per big mac, and the percentage tax. this wil depend on the state and 
//finally the total cost. we will use the scanner class to accomplish it.
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class root{
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);

System.out.print("Enter a double and i print its cube root: ");//this will allow the user to 
    //enter the cost per big mac
    double x= myScanner.nextDouble();
double guess1,guess2,guess3,guess4,guess5;
guess1=x/3;
guess2=(guess1*guess1*guess1+x)/(3*guess1*guess1);
guess3=(guess2*guess2*guess2+x)/(3*guess2*guess2);
guess4=(guess3*guess3*guess3+x)/(3*guess3*guess3);
guess5=(guess4*guess4*guess4+x)/(3*guess4*guess4);
System.out.println("the cube root is "+guess5+" ="+guess5+"*"+guess5+"*"+guess5+"="+
guess5*guess5*guess5+"etimated");
}
}

    