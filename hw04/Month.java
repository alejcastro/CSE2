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
public class Month {
//main method 
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
System.out.print (
"Enter an int giving the number of the month (1-12)- ");//this will allow the user
//to enter the number of BigMacs
// accept user input with the following statement
int month;// this command tell the computer
if(myScanner.hasNextInt())
{
   month = myScanner.nextInt();
   int days=0;

 //System.out.println("You ordered "+nBigMacs+" for $2.22 each giving a total cost of "+nBigMacs*2.22+" dollars" );
 
}
else{
    System.out.println("You did not enter an int");
  return;    //leaves the program, i.e.
                //the program terminates
} 
if (month==2)
{
System.out.print (
"enter the year: ");    
 double Year;//


if(myScanner.hasNextInt())
{
 Year= myScanner.nextDouble();
double YearEx,Year2;
int Year1;
int YearEx2;
Year1=(int)(Year);
YearEx=Year/4;
YearEx2= Year1/4;
Year2=(YearEx-Year1/4);
if(Year2>0)
{
 System.out.println("the month has 28 days");
 
}
else
{
System.out.println("the month has 29 days "+YearEx2+ "example");    
}
    
}
return;}
if(month>0&&month<13)
{                
if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)     
{ 
month=31;
}
if(month==4||month==6||month==9||month==11)
{month=30;

}
System.out.println("the month has " +month+" days");
}
else{
    System.out.println("You did not enter an int between 1-12");
  return; }   //leaves the program, i.e.
                //the program terminates





}
}




