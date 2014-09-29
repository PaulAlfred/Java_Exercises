package bookpack;

public class BookDemo {
	public static void main(String args[])
	{
		Book books[] = new Book[5];
		
		books[0] = new PracticeClass("Java: A Beginner's Guide","Schildt",2011);
		books[1] = new PracticeClass("Java: The Complete Reference","Schildt",2011);
		books[2] = new PracticeClass("The Art of Java","Schildt and Holmes",2003);
	
		for(int i = 0; i < books.length; i++)
		{
			books[i].show();
			books[i].Title();
			
		}
	}
}
