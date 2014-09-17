///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// lab03
//BigMac Program
// as the cyclometer program, this program will compute the distance and velocity of a trip.
//the only difference is that we will use the scanner class to accomplish it. by allowing the
//user to enter the numebr of counts and second of the trip
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class Bicycle{
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
System.out.print (
"Enter the number of counts in the cyclometer(an integer > 0): ");//this will allow the user
//to enter the number of counts
// accept user input with the following statement
int nCounts= myScanner.nextInt();// this command tell the computer to take the user's input
// as the value of nCounts

System.out.print("Enter the seconds under which the count occured: ");//this will allow the user to 
    //enter the number of seconds
double nSeconds = myScanner.nextDouble();
double wheelDiameter=27.0,// diameter of the wheel
PI=3.14159,//this is the value of the constant Pi
feetPerMile=5280,// the numbers of feet per mile
inchesPerFoot=12,// the number of inches per foot
secondsPerHour=3600,// seconds in a hour
secondsPerMinute=60;// seconds in a minute
double distanceTrip,nHours,nMinutes; // our variables
nMinutes=nSeconds/secondsPerMinute;// the number of minutes in the number of seconds divided by 
// the numbers of seconds in an hour
distanceTrip=nCounts*wheelDiameter*PI;//the distance of the trip is the count* the wheel diameter*PI
distanceTrip/=inchesPerFoot*feetPerMile; // this converts the inches to miles 
nHours=nSeconds/secondsPerHour;// this converts the seconds to hours, with this two variables we can now
// compute the ditance and the  velocity
// this will print the distance of the trip in miles, the time in minutes, and the velocity in miles
// per hour
System.out.println("Trip  was "+(int)(distanceTrip*100)/100.0+" miles and took "+nMinutes+ " minutes");
System.out.println("The average mph was "+((int)((distanceTrip/nHours)*100)/100.0+" miles/hours"));
}//end main method
}// end of class
