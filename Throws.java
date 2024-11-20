package Exception_handling;

class Exceptipn 
{
	public void get(String s) throws NullPointerException
	{
		System.out.println(s.length());	
	}
}
public class Throws 
{

	public static void main(String[] args) 
	{

		Exceptipn n = new Exceptipn();
		try
		{
		n.get(null);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
