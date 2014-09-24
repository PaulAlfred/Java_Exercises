

public class Chap2Num10 {
	public static void main(String args[])
	{
		Boolean isPrime = true;
		int counter = 0;
		for(int numberTested = 2; numberTested <= 100; numberTested++)
		{
			isPrime = true;
			counter = 0;
			
			
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
