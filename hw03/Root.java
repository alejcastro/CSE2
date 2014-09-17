//////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// hw03
//Root Program
// This program will compute the cube root of any number you choose by estimating it
// we will guess the right answer by using a formula over and over again until 
//our estimation is accurate enough
// for accomplishing it we will use a scanner to read the number inserted
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class Root{
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
// this will let the user enter his number for the program to read and estimate the
// cube root

System.out.print("Enter a double and i print its cube root: ");//this will allow the user to 
 // to enter the number   
double x= myScanner.nextDouble();// we named x the user's number
double guess1,guess2,guess3,guess4,guess5;// we declare all the variables
guess1=x/3;// this is our first guess
// with our first guess we  plug it in  on the following formula to create another
// guess and with that guess another guess this will allow us to get a better 
// estimation of the real number
guess2=(guess1*guess1*guess1+x)/(3*guess1*guess1);
guess3=(guess2*guess2*guess2+x)/(3*guess2*guess2);
guess4=(guess3*guess3*guess3+x)/(3*guess3*guess3);
guess5=(guess4*guess4*guess4+x)/(3*guess4*guess4);
// with 5 diferent guess our number is close enough with the real value?
// lets test it!
// print  the result of your estimation
System.out.println("the cube root is "+guess5+" ="+guess5+"*"+guess5+"*"+guess5+"="+
guess5*guess5*guess5+" estimated");// for veryfing your answer increased it to the 3rd power
// to see if it is similar to the user's number
}// end main method
}// end class

    