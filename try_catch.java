package Exception_handling;
import java.util.*;
public class Try_catch_finally 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		System.out.println("Enter the number :");
		int	b=sc.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Zero cannot divide any number");
		}
		finally	//to close all connection that was never closed by any object or class becoz of exception 
		{
			sc.close();
		}
		
	}

}
