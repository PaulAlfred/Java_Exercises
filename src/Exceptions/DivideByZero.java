package Exceptions;

public class DivideByZero implements iErrorHandling{

	
	DivideByZero(int x, int y)
	{
		System.out.print("The quotient is : ");
	}

	@Override
	public void divide(int x, int y) 
	{
		try
		{
			System.out.print(x/y);	
		}
		catch(ArithmeticException ae)
		{
			System.out.println("\nCaution! you are dividing by zero.");
		}
		finally
		{
			System.out.println("Finally!! You're here!!");
		}
	}
}
