package bookpack;

public class Book {
	protected String title;
	protected String author;
	protected int pubDate;
	
	Book(String t, String a, int d)
	{
		title = t;
		author = a;
		pubDate = d;
	}
	void show()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
	
	void Title()
	{
		System.out.println(title);
	}
	
}
