package assignments;

public class Printdevice_Ass22 
{

	public static void main(String[] args)
	{
		for (int i=1;i<=500;i++)
		{
			if (i%3==0)
			{
			System.out.println("computer"+i);
			}
		
			
		if (i%5 ==0)
		{
			System.out.println("Mouse"+i);
		}
		if (i%3 ==0 && i%5 ==0)
		{
			System.out.println("computer"+i);
		}
	}

	}}
