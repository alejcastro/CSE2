/* this program will make the user to enter a integer from 1 to 9 and will print the
numbers in a pyramid
we will do this using three different methods: while,do,and for loops.
define the class */
import java.util.Scanner;
public class NumberStack {
    public static void main(String arg[]) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        System.out.print("enter an integer from 1-9  ");
        int user = 0;
        int number = 1;
        if (myScanner.hasNextInt()) {
            user = myScanner.nextInt();
        }
        else {
            System.out.println("you did enter an integer");
        }

        if (user > 1 || user < 9) {

            int counter = 0;
            int time = 0;
            int inc = number * 2 - 1;


            while (number <= user) {
                //System.out.println(number);
                //inc=number*2-1;


                counter = 0;
                while (number > counter) {
                    //System.out.print("number="+number+" counter="+counter );
                    counter++;

                    time = 0;
                    inc = number * 2 - 1;

                    //System.out.print("time="+time+" ,inc= "+inc);
                    //while
                    while (time < inc) {
                        // System.out.print("time="+time+" ,inc= "+inc);

                        System.out.print(number);
                        time++;

                    }
                    System.out.println();
                }




                number++;
            }

            for (number=1; number <= user; number++) {
                inc = number * 2 - 1;
                for (counter=0; number > counter; counter++) {
                    for (time=0; time < inc; time++) {
                        System.out.print(number);


                    }
                    System.out.println();
                }


            }
              number = 1;
               counter = 0;
             time = 0;
             inc = number * 2 - 1;
       
             do {


                counter = 0;
                do{
               
                    //System.out.print("number="+number+" counter="+counter );
                    counter++;

                    time = 0;
                    inc = number * 2 - 1;

                    //System.out.print("time="+time+" ,inc= "+inc);
                    //while
                    do
                    {
                        // System.out.print("time="+time+" ,inc= "+inc);

                        System.out.print(number);
                        time++;

                    }while (time < inc); 
                    System.out.println();
                }  while (number > counter);




                number++;
            } while (number <= user); 
                


        }


        else {
            System.out.println("you did not enter an integer from 1-9");
        }




    }
}
