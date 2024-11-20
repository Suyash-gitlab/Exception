package Exception_handling;
import java.util.*;
class bajajException extends RuntimeException
	{
		public bajajException(String s)
		{
			super(s);
		}
		
	}

	public class Throw 
	{
	

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Age");
			int age=sc.nextInt();
			
			if(age>=21)
			{
				System.out.println("You Are Age "+age+" Eligible for Bajaj Finance Loan :");
			}
			else
			{
			throw new bajajException("You Are Age "+age+" is Not Eligible for Bajaj Finance Loan :");
			}

		}

	}



