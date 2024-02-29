package assignments;
import java.util.Scanner;
import java.util.InputMismatchException;  

public class Exception_Handling_Program {

	public static void main(String[] args)
	{
		int rollno[] =new int[3];
		Scanner a1 =new Scanner (System.in);
		for (int i=0; i<=2;i++)
		{
			try
			{
			rollno[i] =a1.nextInt();
			}
			catch (InputMismatchException b1)
			{
				System.out.println(rollno[2]);
			}
				
		}
		try 
		{
				
		rollno[3] =21;
		}
		catch (ArrayIndexOutOfBoundsException a2)
		{
			System.out.println(rollno[2]);
		}
		
	}

}