/* this program will simulate a ruloutte the user
will enter an  integer from 1-38 and the program will simulate 100,000 trials  and see if:
 makes profit
how many times  wins
how many times lose everything */
import java.util.Scanner;
//define class
public class ex {
    //main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print(
            "enter an integer from 1-38  ");
        int  winningNumber;
        if (myScanner.hasNextInt()) // if the user enter an integer
        {
            winningNumber = myScanner.nextInt(); //then income is  the int the user enter
        }
        else {
            System.out.println("You did not enter an int"); // if not exit the program
            return; //leaves the progtam, i.e.
        }


    // declare all the variables
    int win = 0;
    int timesWon= 0;
    int timesLost = 0;
    int totalWinnings = 0;
   
    // this first loop will run 1000 times the"100 loops roullete"
    for(int i = 1; i<=1000; i++){
      for(int j = 1; j<=100; j++){//this second one will run the roullete 100 times
        int random = ((int)(Math.random() * 38)) + 1;// this will create a random number
        //that will be compare later with the number the user input
        if(winningNumber == random){// comparing the two numbers if they are equal he wins 1 time
          win++;
        }      
      }
      if (win == 0){// if on the 100 times they play is not equal even once he lost everything one time
        timesLost++;
      }
      else if(win>=1){// if on the 100 times he makes wins at least once he makes 36 dollars
        totalWinnings += win*36;
      }
      else if(win>=3){// if in the 100 times he wins 3 or more times he makes more money than he spend
        timesWon++;
      }
      win = 0;
    }
    // print your results
    System.out.println("The Number of times  lost everything is " + timesLost);
    System.out.println(" total winnings of all 1000 simulations is " + totalWinnings);
    System.out.println("The number of times  walk  with a profit is " + timesWon);
    
    
    
  }
  
}