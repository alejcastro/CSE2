///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// lab02
//Cyclometer Program
//define a class
public class Cyclometer{
//add main method
public static void main (String[] args){
    
// write all input data
int secsTrip1=480;  // time of 1 trip
int secsTrip2=3220; //time of 2 trip
int countsTrip1=1561;// counts of 1 trip
int countsTrip2=9037; //counts of 2 trip
// intermediate variables and output data
double wheelDiameter=27.0,  //
PI=3.14159, //this is the value of the constant Pi
feetPerMile=5280,// the numbers of feet per mile
inchesPerFoot=12,// the number of inches per foot
secondsPerMinute=60; // the numbers of seconds in a minute

//print out the numbers that you have stored in the variable seconds and the counts
System.out.println("Trip 1 took "+
(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
System.out.println ("Trip 2 took "+
(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
//run the calculations; store the values. Document your calculations here.What
//are your calculating?
distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above give the distances in inches
//( foreach count, a rotation of the wheel travels the diameter
//in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; // this will give the distance in mile
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;// the formula for total distance
//Print out the output data
System.out.println("Trip 1 was "+distanceTrip1+" miles and took" +nHours+ "hours");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");
}//end main method
}// end of class