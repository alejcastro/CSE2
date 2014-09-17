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
public class bicycle{
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
System.out.print (
"Enter the number of counts in the cyclometer(an integer > 0): ");//this will allow the user
//to enter the number of BigMacs
// accept user input with the following statement
int nCounts= myScanner.nextInt();// this command tell the computer
//that scanner has the next int
System.out.print("Enter the seconds under which the count occured: ");//this will allow the user to 
    //enter the cost per big mac
double nSeconds = myScanner.nextDouble();
double wheelDiameter=27.0,
PI=3.14159,//this is the value of the constant Pi
feetPerMile=5280,// the numbers of feet per mile
inchesPerFoot=12,// the number of inches per foot
secondsPerHour=3600,
secondsPerMinute=60;
double distanceTrip,nHours,nMinutes;
nMinutes=nSeconds/secondsPerMinute;
distanceTrip=nCounts*wheelDiameter*PI;
distanceTrip/=inchesPerFoot*feetPerMile; 
nHours=nSeconds/secondsPerHour;
System.out.println("Trip  was "+(int)(distanceTrip*100)/100.0+" miles and took "+nMinutes+ " minutes");
System.out.println("Trip  was "+((int)((distanceTrip/nHours)*100)/100.0+" miles/hours"));
}//end main method
}// end of class
