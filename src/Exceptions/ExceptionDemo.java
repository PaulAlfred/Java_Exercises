package Exceptions;
import java.util.*;

public class ExceptionDemo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dividend: ");
		int x = sc.nextInt();
		System.out.println("Divisor: ");
		int y = sc.nextInt();
		
		DivideByZero dbz = new DivideByZero(x, y);
		dbz.divide(x, y);
		
	}
}
