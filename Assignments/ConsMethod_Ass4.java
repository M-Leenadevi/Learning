package assignments;

public class ConsMethod_Ass4
//Constructor overloading 
{
	ConsMethod_Ass4()
	{
		System.out.println("Constructor Overloading");
	}
	ConsMethod_Ass4(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	//method overloading 
	static void mutiple (double a, int d)
	{
		double e = a*d;
		System.out.println(e);
			
	}
	void mutiple (double a , int c, int b)
	{
		double f = a*c+b;
		System.out.println(f);
	}

	public static void main(String[] args)
	{
		new ConsMethod_Ass4();
		ConsMethod_Ass4 a =new ConsMethod_Ass4(10,10);
		mutiple(10,11);
		a.mutiple(12.345,234,234);
		
		
		
		

	}

}
