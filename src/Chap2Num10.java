import java.util.ArrayList;



public class Chap2Num10 {
	public static void main(String args[])
	{
		Boolean isPrime = true;
		int counter = 0;
		//ArrayList<Integer> Primes = new ArrayList<Integer>();
		/*
		Primes.add(2);
		Primes.add(3);
		Primes.add(5);
		Primes.add(7);
		*/
		for(int numberTested = 2; numberTested <= 100; numberTested++)
		{
			isPrime = true;
			counter = 0;
			/*for(int prime_i = 0; prime_i < Primes.size(); prime_i++ )
			{
				
				if(numberTested % Primes.get(prime_i) == 0 && Primes.get(prime_i) == numberTested )
				{
					isPrime = true;
					break;
				}
			}
			if(isPrime == true)
			{
				System.out.print(numberTested);
				Primes.add(numberTested);
			}*/
			
			for(int dividend = 2; dividend <= 100; dividend++)
			{
				if(numberTested%dividend == 0 && numberTested != dividend)
				{
					counter++;
				}
				if(counter == 1)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println(numberTested);
			
		}		
	}
}
