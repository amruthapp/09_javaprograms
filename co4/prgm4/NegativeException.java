//Find the average of N positive integers, raising a user defined exception for each negative input.


import java.util.Scanner;

class AverageException extends Exception
{
   AverageException()
   {
     super();
   }
   AverageException(String s)
   {
     super(s);
   }
}

class NegativeException 
{
   public static void main(String args[])
    {
      try
      {
	float sum=0,num=0;
	float avg;
	int i=1;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.of numbers : ");
	int n=sc.nextInt();
	System.out.println("enter the numbers : ");
	while(i<=n)
	{
	num=sc.nextInt();

	if(num<0)
	   throw new AverageException("Negative Number");
	else
	   sum=sum+num;
	   i=i+1;
	}
	   avg=sum/n;
	   System.out.println("the average of numbers is "+avg);
	}
	catch(AverageException e)
	{
	   System.out.println(e);
	}
	finally
	{
	    System.out.println("program ends...");
	}
   }
}
        
 