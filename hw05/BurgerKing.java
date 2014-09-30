//////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// hw05
//Burger king Program
// this program will allow the user to chose between burger fries and soda
// after this it will allow the user to choose more option inside that option
// example: if the user choose soda it will ask what kind of soda and will print the
//answer
//for using the scanner this should be the first statement in your program
//for using the scanner this should be the first statement in your program:
import java.util.Scanner; // declare the scanner outside the class
//define the class
public class BurgerKing {
    //main method 
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        // tell the user what to input
        System.out.println("Enter a letter to indicate a choice of (B,b,F,f,l,L):");
        System.out.println(" Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f): ");

        String choice;
        // declare choice as a string to allow letters
        // we need to make sure the user enter a valid caracter
        if (myScanner.hasNext()) {
            // this will make choice the caracter enter by the user    
            choice = myScanner.next();
        }
        else {
            System.out.println("You did not enter an letter");
            return;
        }
        // this will allow the program to detect if the user enter a valid option
        
       
        // now we need to tell the program what to do with each option
        // we use switch to make each case
        String fixins;
        String size;
        String soda;
        // if the number of letter is greater than one this error will show up
        if (choice.length() > 1) {
                    System.out.println("a single letter expected");
                }
                //if the letter is one and is a letter than the rest of the program will run
                // at the end we will test if the actual letter  is valid  B,b,F,f,l,L
                else{
        switch (choice) {
            // if the user wants a burger:    
            case "B":
            case "b":
                System.out.println("Enter A or a for all the fixins");
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above c: ");
                fixins = myScanner.next();
                // this will alllow the user to enter the fixins of the burger
               
                // this will alllow the user to enter the fixins of the burge
                switch (fixins) {
                    case "a":
                    case "A":
                        // this prints the final result    
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "c":
                    case "C":
                        // this prints the final result      
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":
                    case "n":
                        // this prints the final result      
                        System.out.println("You ordered a burger with no fixins");
                        break;
                         default:
                         // If the user enter more than one letter than this error occurs
                if (fixins.length() > 1) {
                    System.out.println("a single letter expected");
                }// if the user did not enter a valid letter
                else {
                    System.out.println("You did not enter a letter  A, a, c,C,N,n ");
                    return;
                    
                }//end the else statement
            break;
                }//end the type of fixin switch

                break;// break the program
                //if the user choose fries:
            case "f":
            case "F":
                
                System.out.println("do you want small or large?: ");

                // tell the computer size value should be the value of the user
                // initialize the variable size  
                size = myScanner.next();
                // we allow the user to choose between large or small

                switch (size) {
                    case "S":
                    case "s":
                        // this prints the final result      
                        System.out.println("Yo ordrered small fries");
                        break;
                    case "L":
                    case "l":
                        // this prints the final result  if is large    
                        System.out.println("You ordered  large fries");
                        break;
                         default:
                         // if the user enter more than one letter this error occurs
                if (size.length() > 1) {
                    System.out.println("a single letter expected");
                }// end the if statement
                else {
                    System.out.println("You did not enter a letter  s, S, L,l ");
                    return;
                    
                }// end the else statement
            break;
                }//end the size of the fries switch
                break;
                // if the user chooses soda then
            case "S":
            case "s":
                   //ask the user which type of soda
                System.out.println("do you want pepsi(P or p) ");
                System.out.println(" coke (c or C)");
                System.out.println("Mountain dew (M or m): ");
                // this initialize the variable type that will help know what type of soda the user choose 
                soda = myScanner.next();
                // the types of soda the user can choose

                switch (soda) {
                    case "P":
                    case "p":
                        // this prints the final result  is pepsi    
                        System.out.println("Yo ordered pepsi");
                        break;
                    case "c":
                    case "C":
                        // this prints the final result  if is coke    
                        System.out.println("You ordered coke");
                        break;
                    case "M":
                    case "m":
                        // this prints the final result  is is mD    
                        System.out.println("You ordered Mountain Dew");
                        break;
                        default:
                        // if the user enters more than one lette this error occurs
                if (soda.length() > 1) {
                    System.out.println("a single letter expected");
                }//if  the user did not enter a valid letter this error occurs
                else {
                    System.out.println("You did not enter a letter  P, p, c,C,M,m ");
                    return;
                    
                }//end the else statement

                }// end the type of soda switch
                break;

            default:
                //as we said before we give an error message if at the 
                // beginning of the program the user did not
                //  s,S B,b,F,f
                
                    System.out.println("You did not enter a letter  s, S, B,b,F,f ");
                    return;
                    
                }//and the first switch
            
        }
    }//end main method
       





    }//end class




