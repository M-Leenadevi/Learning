package assignments;

public class Nestedifcondition_Ass16 {

	public static void main(String[] args)
	{
		int a =10;
		int b=20;
		int c=30;
		if (a>=b)
		{
			int d =a+c;
			System.out.println(d);
			if (a!=c)
			{
				 d =a+c;
				System.out.println(d);	
			}
			else 
			{
				System.out.println("looping 1");
			}
		}
		else 
		{
			if (b<c)
			{
				int d =a+c;
				System.out.println(d);
			}
			else 
			{
				System.out.println("looping 2");	
			}
		}
		

	}

}
