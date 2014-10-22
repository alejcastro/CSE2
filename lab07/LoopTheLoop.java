/* this program will tell the user to enter a integer from 1-15 and will print out the number of stars the user 
entered */
//import.java.util.Scanner;
public class LoopTheLoop {
    public static void main(String arg[]) {
       // Scanner myScanner;
       // myScanner = new Scanner(System.in);
        System.out.print("enter an integer from 1-15-   ");
        int nStar = 10;
        String pound= "*";
        

        //int number =MyScanner.nextInt();

            while (nStar >= 1) {
               // pound=(pound "*"\\);
                
               System.out.print(pound+" "+pound);
                System.out.println("*");
                nStar = nStar - 1;
            }



    }

}