
public class Chap1Num10 {
	public static void main(String args[])
	{
		int inches_i, counter = 0;
		double inchesToMeters_m = 0.0254;
		double meters_m;
		
		for(inches_i = 1;  inches_i <= 12*12; inches_i++)
		{
			meters_m = inchesToMeters_m * inches_i;
			counter++;
			
			if(counter == 12)
			{
				System.out.println();
				counter = 0;
			}
			
			System.out.println(inches_i+ " inches is equal to " + meters_m + "meters");
		}
		
	}
}
