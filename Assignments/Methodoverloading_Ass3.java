package assignments;

public class Methodoverloading_Ass3 {
	public static void add()
	{
		System.out.println("Add two number");
	}
	public static void subtract()
	{
		System.out.println("subtract two number");
	}
void test ()
{
	System.out.println("given method is non-static");
}
void practice()
{
	System.out.println("non-static practice");
}
	public static void main(String[] args)
	{
		add();
		subtract();
		Methodoverloading_Ass3 a = new Methodoverloading_Ass3();
		a.test();
		a.practice();
		
		

	}

}
