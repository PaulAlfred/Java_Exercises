
public class Chap06Num13 {
	public static void main(String args[])
	{
		System.out.print(Sums(1,5,6,6,2,5,20,5));
		
	}
	public static int Sums(int ... number)
	{
		int sum = 0;
		
		for(int i = 0; i < number.length; i++)
		{
			sum += number[i];
		}
		
		return sum;
	}
}
