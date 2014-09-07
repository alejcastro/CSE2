///////////////////////////////////////////////////////////////////////
// Alejandro Castro 
// hw02
//Arithmetic Program
//define a class
public class Arithmetic{
// add main method    
public static void main (String[] args){
//write all input data
int nSocks=3;// number of pairs of socks
double sockCost$=2.58;// cost of each pair of socks
// $ is part of the of the variable name
int nGlasses=6;// number of glasses
double glassCost$=2.29; // cost per glass
int nEnvelopes=1; // Number of boxes of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;
// variables and output data
double totalSocksCost$,totalGlassesCost$,totalEnvelopeCost$;
double totalCostBTaxes$,totalCost$;
// print out the numbers that you have stored
totalSocksCost$= sockCost$*nSocks*100/100.00;
totalGlassesCost$=glassCost$*nGlasses*100/100.00;
totalEnvelopeCost$=envelopeCost$*nEnvelopes*100/100.00;
totalCostBTaxes$=totalEnvelopeCost$+totalGlassesCost$+totalSocksCost$;
totalCost$=(totalCostBTaxes$*taxPercent+totalCostBTaxes$)*100/100.00;



System.out.println("the total cost of the socks is "+(int)(totalSocksCost$*100)/100.0+" with "+((int)((totalSocksCost$*taxPercent)*100)/100.0)+" of tax giving a total of "+((int)((totalSocksCost$*taxPercent+totalSocksCost$)*100)/100.0)+" dollars");
System.out.println("the total cost of the glasses is ");
System.out.println((int)(totalGlassesCost$*100)/100.0+" with "+((int)((totalGlassesCost$*taxPercent)*100)/100.0));
System.out.println(" giving a total of "+((int)((totalGlassesCost$*taxPercent+totalGlassesCost$)*100)/100.0+" dollars "));
System.out.println("the total cost of the envelopes is "+((int)(totalEnvelopeCost$*100)/100.0)+" with "+((int)((totalEnvelopeCost$*taxPercent)*100)/100.0)+" giving a total of "+((int)((totalEnvelopeCost$*taxPercent+totalEnvelopeCost$)*100)/100.0)+" dollars ");
System.out.println("the total cost of everything is "+((int)(totalCostBTaxes$*100)/100.0)+
" with "+((int)((totalCost$-totalCostBTaxes$)*100)/100.0)+
" giving a total of "+(int)(totalCost$*100)/100.0+" dollars");
}//end main method





}//end classs