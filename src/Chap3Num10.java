import java.io.*;

public class Chap3Num10 {
	public static void main(String[] args) throws IOException
	{
		int number;
		
		do
		{
			number = System.in.read();
			while ((char)number == '.');
			{
				 if( number >= 97 )
					 System.out.print((char)(number-32));
				 else
					 System.out.print((char)(number+32));
			}
		}while((char)number!='.');
		
	}
}
