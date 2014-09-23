///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// hw04
//Month Program
//this program allow the user to enter a number from 1-12 that wiil the determine the month
// after the user enter the number the program will tell the user the number of days that month has
//for using the scanner this should be the first statement in your program
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class Month {
//main method 
public static void main(String[] args) {
    
Scanner myScanner;
myScanner=new Scanner(System.in);
// this tell the user to enter an int from 1-12
System.out.print (
"Enter an int giving the number of the month (1-12)- ");
// initialied month
int month;// 
// we have to be sure the user enter an integer
if(myScanner.hasNextInt())
{
   month = myScanner.nextInt();



 
}
else{
    System.out.println("You did not enter an int");
  return;    //leaves the program, i.e.
                //the program terminates
} 
//first we have to deal with leap years therfore we have to focus on february
if (month==2)
{
System.out.print (
"enter the year: ");    
 double Year;//


if(myScanner.hasNextInt())
{
// we make year the number enter by the user    
 Year= myScanner.nextDouble();
 //we initialized YearEx,Year2 as doubles for us to be able to used them to find
 // the leap years
double YearEx,leapYear;
 //we initialized Year1,YearEx2 as int for us to be able to used them to find
 // the leap years
int intYear;

// we used Year1 to make the int entered by the user an int 
intYear=(int)(Year);
// we divide yearEx by 4  and call it YearEx this will be our double 
YearEx=Year/4;
// now we subrtact our double with our int divided by 4 this way the int will not have
// any decimal points even if is not a number divisible by 4 but the double will this will we  get
// just the decimal points
leapYear=(YearEx-intYear/4);
// now, if we have decimal points is because the years was not divisible by 4 and therefore was not a leap year
// and viceversa
if(leapYear>0)
{
 System.out.println("the month has 28 days");
 
}
else
{
System.out.println("the month has 29 days ");    
}
    
}
return;}// this will end  the program after printing the number of days
// now we need to know if the user gave a month between 1 and 12
if(month>0&&month<13)
{ 
// this are all the months that have 31 days    
if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)     
{ 
month=31;
}
// this are all the months that have 30 days
if(month==4||month==6||month==9||month==11)
{month=30;
// now that we defined the number of days we print our answer
}
System.out.println("the month has " +month+" days");
}
// if the user do not enter a number between 1 and 12 the program will end and tell the user the mistake
else{
    System.out.println("You did not enter an int between 1-12");
  return; }   //leaves the program, i.e.
                //the program terminates





}
}




