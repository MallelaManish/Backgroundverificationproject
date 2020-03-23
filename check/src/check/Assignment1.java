package check;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String args[])
	{
	 int number;
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter a number");
	 number=scan.nextInt();
	 System.out.println("The of n natural numbers, which are divisible by 3 or 5 "+calculateSum(number));
	 }
	 public static int calculateSum(int number)
	{ 
          
	int m,sum1=0,sum2=0,i;
	for(i=1;i<=number;i++)
	 {
		if((i%3==0 || i%5==0))
		{
		sum1=sum1+i;
		}
	}
	return sum1;

	}

}
