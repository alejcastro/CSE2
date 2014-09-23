///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// hw04
//IncomeTax Program
// this program will allow the user to enter an int of the thousand of dollars 
//income. After the user enter the int the program will calculate the taxes 
// that depends on the following:<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; 
//>=78, 14%
import java.util.Scanner;
//define class
public class IncomeTax {
//main method
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
System.out.print (
"enter an int giving the number of thousands(an integer >0):-  "); //tell the user
//to enter the income 
//now we declare the new int entered by the user as income so we can used it later
//in the program
int income;
// we declare the taxes as a double because we will need the decimal place
double taxes=0.0;
//our first if statement will ensure that the user enter an int if not it will
//print "you did not enter an integer and will exit the program

if(myScanner.hasNextInt())// if the user enter an integer
{
income= myScanner.nextInt();//then income is  the int the user enter
}
else{
System.out.println("You did not enter an int");// if not exit the program
return; //leaves the progtam, i.e.
        // the program terminates
}// after we are sure the user did enter an integer we need to be sure is an int
// greater than 0
if(income>0){ // this if statement will tell us if the user enter an int greater than 0if not it will exit the program
// now that we know the user enter an integer greater than one we start using if statement to get the diferent
//tax incomes
if(income<20){ // if the int is less than 20000 the tax is 5%
taxes=0.5; //i

}
if(income>20&&income<40){// if the income is greater than 20000 but less than 40000 than the tax is 7%
taxes=0.7;    
}
if(income>40&&income<78){// if the income is greater than 40000 but less than 780000 than the tax is 12%
taxes=0.12;    
}
if(income<78){//if the income is 780000 the tax is 14%
taxes=0.14;    
}
double nTaxes=taxes*100;
double tTaxes=income*1000*taxes;
// after we defined the tax we print our answer 
System.out.println("The tax rate on " +income*1000+ " is "  +((int)(nTaxes)*100)/100+ "%, and the tax is "+((int)(tTaxes)*100)/100.0+" dollars");


  
}// if the user did not enter an integer >0 than this part will exit the program
else {
System.out.println("you did not enter an int grater than 0");   
return;
    
} //end of else statement
        
}//end of main method



}//end of class
