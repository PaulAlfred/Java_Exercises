package bookpack;

public class PracticeClass  extends Book implements iInfo {
	
	private String publishing;
	private String ISN_num;
	
	PracticeClass(String t, String a, int d)
	{
		super(t, a, d);
		
		title = " ";
	}
	
	void Title()
	{
		System.out.println("Title Method was Overriden");
	}

	@Override
	public String getPublishing(String pub) 
	{
		publishing = pub;
		return publishing;
	}

	@Override
	public String getISN_num(String isn) 
	{
		ISN_num = isn;
		return ISN_num;
	}
	
}
