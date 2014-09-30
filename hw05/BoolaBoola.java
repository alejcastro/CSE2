/////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// hw05
//BoolaBoola Program
// in this program we will create 3 boolean variables with random true and false 
// we will combine this 3 variables with ands and ors:(4 different combinations) and the computer
// will give us if is true or false
// we will ask the user this answer and compare it with the computer's answer
// if the user is right (the answer is the same as the computer answer)then is correct
// if not is incorrect
//for using the scanner this should be the first statement in your program
//for using the scanner this should be the first statement in your program:
import java.util.Scanner;
//define the class
public class BoolaBoola {
    //main method 
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
// declare the variable that will carry the user's answer
        String answer;
//declare the 3 different random variables        
        boolean variable1 = true;
        boolean variable2 = true;
        boolean variable3 = true;
        boolean result = true;// declare the result of the and and or
        // this variable will help us make our 4 different combinations of ands and ors
        int randomtry = (int)(Math.random() * 4) + 1;
        // this 3 variables will give us a random true or false in the  3 booleans
        int number1 = (int)(Math.random() + .5);
        int number2 = (int)(Math.random() + .5);
        int number3 = (int)(Math.random() + .5);
// we make the random true or false for the first boolean
        switch (number1) {
            case 1:
                variable1 = true;
                break;

            case 0:
                variable1 = false;
                break;
//we make the random true or false for the second boolean
        }
        switch (number2) {
            case 1:
                variable2 = true;
                break;

            case 0:
                variable2 = false;
                break;
        }
        //we make the random true or false for the third boolean
        switch (number3) {
            case 1:
                variable3 = true;
                break;

            case 0:
                variable3 = false;
                break;
                
                //now we make the random and and or combinations
        }
        switch (randomtry) {
            //first combinations of ands and ors
            case 1:

                result = variable1 && variable2 || variable3;
// we ask the user the question
                System.out.println("does " + variable1 + " &&" + variable2 + " || " + variable3 + " have the value true(t/T) or false(f/F)? ");
                answer = myScanner.next();


                if (result == true&&(answer.equals("T") || answer.equals("t"))) {
                    // if the result is the same as the answer is correct other than that is wrong
                    if (answer.equals("T") || answer.equals("t")) {
                        System.out.println("CORRECT");
                    }

                    else {
                        System.out.println("INCORRECT");
                    }
                }
                break;
                //second combination of ands and ors

            case 2:
                result = variable1 && variable2 && variable3;
// we ask the user the question
                System.out.println("does " + variable1 + " &&" + variable2 + " && " + variable3 + " have the value true(t/T) or false(f/F)? ");
                answer = myScanner.next();
                // if the result is the same as the answer is correct other than that is wrong


                if (result == true&&(answer.equals("T") || answer.equals("t"))) {
                        System.out.println("CORRECT");
                }
                else {
                    System.out.println("INCORRECT");

                }

                break;
                //3rd combination of ands and ors

            case 3:
                result = variable1 || variable2 || variable3;
// we ask the user the question
                System.out.println("does " + variable1 + " ||" + variable2 + " || " + variable3 + " have the value true(t/T) or false(f/F)? ");
                answer = myScanner.next();


                if (result == true&&(answer.equals("T") || answer.equals("t"))) {
                    // if the result is the same as the answer is correct other than that is wrong
                   
                        System.out.println("CORRECT");
                    }

                    else {
                        System.out.println("INCORRECT");
                    }
                
                break;
                // 4rth and last combination of ands and ors
            case 4:
                result = variable1 || variable2 && variable3;
// we ask the user the question
                System.out.println("does " + variable1 + " ||" + variable2 + " && " + variable3 + " have the value true(t/T) or false(f/F)? ");
                answer = myScanner.next();


                if (result == true&&(answer.equals("T") || answer.equals("t"))) {
                    // if the result is the same as the answer is correct other than that is wrong
                        System.out.println("CORRECT");
                    }

                    else {
                        System.out.println("INCORRECT");
                    }
                    break;
                }
                
        }
    }

