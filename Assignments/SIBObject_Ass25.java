package assignments;

public class SIBObject_Ass25 {
	SIBObject_Ass25()
	{
		System.out.println("this is constructor");
	}
	static 
	{
		System.out.println("this is SIB");
	}
	{
		System.out.println("this is IIB");
	}
	{
	System.out.println("this is IIB");
	}

	public static void main(String[] args)
	{
		System.out.println("this is main method");
		
		SIBObject_Ass25 a = new SIBObject_Ass25();
		new SIBObject_Ass25();
		new SIBObject_Ass25();
		
	}
static 
{
	System.out.println("this is SIB");
}
}
