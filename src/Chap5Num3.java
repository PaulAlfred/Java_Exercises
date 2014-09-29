import java.awt.peer.SystemTrayPeer;


public class Chap5Num3 {
	public static void main(String args[])
	{
		double[] array = {2.45, 45.564, 1.33, 12.82, 45.34, 26.84, 68.47, 1.95, 24.97, 90.45, 9.89};
		double sum = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
			sum += array[i];
		}
		
		System.out.println("\nThe average of array double is " + sum/array.length);
	}
}
