package check;
/*This program is used to find the difference between the sum of the squares of the first n natural numbers andthe square of their sum.For Example if n is 10
,you have to find (1^2+2^2+3^2+….9^2+10^2)-(1+2+3+4+5…+9+10)^2  */

import java.util.Scanner;

public class SumOfSquareNumber {
	 public static void main(String args[])
	 {
	     int number;
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter a number");
	     number=scan.nextInt();
	     System.out.println("Difference between the sum of the squares of the first"
	     		+ "n natural numbers and the square of their is sum="+ calculateDifference(number));
         }
          static int  calculateDifference(int number)
         {
	    int sum1=0,sum2=0,i;
	    int square1,square2,result;
	    for(i=1;i<=number;i++)
	    sum1=((i*i)+sum1);
	    for(i=1;i<=number;i++)
	    sum2=i+sum2;
	    square1=sum1;
	    square2=((sum2*sum2));
        result=square1-square2;
        return result;
	 }

}
