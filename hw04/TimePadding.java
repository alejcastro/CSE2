///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// lab03
//Time Padding
// this program will compute the  the hours minutes and seconds after the user enter a number of seconds
//for using the scanner this should be the first statement in your program
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class TimePadding {
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
//this allow the  user to enter the number of seconds
System.out.print (
"Enter the number of seconds(an integer > 0): ");//this will allow the user

// accept user input with the following statement
int nSeconds;// this command tell the computer
// we need to be sure the user enter a integer if not we should tell the user
if(myScanner.hasNextInt())
{
    nSeconds= myScanner.nextInt();


 
}
else{
    System.out.println("You did not enter an int");
  return;    //leaves the program, i.e.
                //the program terminates
}
if(nSeconds<=86400)
{
// we initialize our variables with doubles and int for getting the decimal places of our subtactions
double nHours,nMinutes,Reminder;
int nIHours,nIMinutes;
// we first find the number of hours by divinding the seconds by 3600
// is important the nHours is a double for getting the decimals of it 
nHours= nSeconds/3600.00000;
// now we made nHours a int
nIHours=(int)(nHours);
// we subtract nIHours to nHours to get just the reminder and multiplied it to get the number of minutes
nMinutes=(nHours-nIHours)*60;
// we make our nMinutes an integer
nIMinutes=(int)(nMinutes);// 
// we subtract nIMinutes to nMinutes to get our reminder and multiplied it by 60 to get our seconds
Reminder=(nMinutes-nIMinutes)*60;
int intReminder=((int)(Reminder)*10)/10;// we eliminate any unwanted decimal places
// we print our answer
// the hard part of this is getting the form x:0x:0x however for accomplishing it we use print f and add state 2 decimal places to our
//values of minutes and seconds
System.out.print("The Time is    "+nIHours+":");
System.out.printf("%02d",nIMinutes);
System.out.print(":");
System.out.printf("%02d%n",intReminder);

    
}
else 
{System.out.println("the number of seconds you enter is greater than a day");
}
}
}





