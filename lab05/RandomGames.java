//
//Alejandro Castro
//RandomGames Program
//

import java.util.Scanner;
//define class
public class RandomGames{
//main method
public static void main(String[] args) {
Scanner myScanner;
myScanner=new Scanner(System.in);
System.out.print(
"Enter R or r for Roulette, C or c for craps, P or p for pick a card- g  ");// this will tell the user to enter the what type of game to play
String GameString;
String Stringsuit;

GameString= myScanner.next();
switch(GameString) {
case "p":
case "P":
int suit=(int)(Math.random()*4)+1;
switch(suit){
case 1:
Stringsuit="hearts";
break;
case 2:
Stringsuit="diamonds";
break;
case 3:
Stringsuit="spades"; 
break;
case 4:
Stringsuit="asaber"; 
break;


}

System.out.println("the number is "+Stringsuit+"of");

break;  

case "C":
case "c":
int dice=(int)(Math.random()*6)+1;
int dice2=(int)(Math.random()*6)+1;
//int craps= dice+dice2
System.out.println("craps:"+dice+"+"+dice2+"="+(dice+dice2));
break;
}      
    }
}