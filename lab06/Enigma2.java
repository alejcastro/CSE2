import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: because it said it is a division by zero which is a run time error and it tells you in what row is
 located
 the error was in row 9 where 40 was divided by 0
 Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * 
 * 
 * 
 * 
 */
