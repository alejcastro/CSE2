///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// lab03
//Time Padding
// this program will compute the 
//for using the scanner this should be the first statement in your program
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class CourseNumber {
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
System.out.print (
"Enter the number of seconds(an integer > 0): ");//this will allow the user
//to enter the number of BigMacs
// accept user input with the following statement
int nSeconds;// this command tell the computer
if(myScanner.hasNextInt())
{
    nSeconds= myScanner.nextInt();

 //System.out.println("You ordered "+nBigMacs+" for $2.22 each giving a total cost of "+nBigMacs*2.22+" dollars" );
 
}
else{
    System.out.println("You did not enter an int");
  return;    //leaves the program, i.e.
                //the program terminates
}
double nHours,nMinutes,Reminder;
int nIHours,nIMinutes;
nHours= nSeconds/3600.00000;
nIHours=(int)(nHours);
nMinutes=(nHours-nIHours)*60;
nIMinutes=(int)(nMinutes);
Reminder=(nMinutes-nIMinutes)*60;
int intReminder=((int)(Reminder)*10)/10;
//System.out.println("the time is " +nIHours+":"+nIMinutes+":"+((int)(Reminder)*10)/10+ " ");
System.out.print("The Time is    "+nIHours+":");
System.out.printf("%02d",nIMinutes);
System.out.print(":");
System.out.printf("%02d%n",intReminder);

    
}
}