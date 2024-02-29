package assignments;

public class ConstructorOverloading_Ass2 
{
	ConstructorOverloading_Ass2()
	{
		System.out.println("Constructor without parameter");
	}
	ConstructorOverloading_Ass2(int a)
	{
		System.out.println("Constructor with int a");
	}
	ConstructorOverloading_Ass2(String a)
	{
		System.out.println("Constructor with string b");
	}
	ConstructorOverloading_Ass2(boolean a)
	{
		System.out.println("Constructor with boolean");
	}
	ConstructorOverloading_Ass2(char a)
	{
		System.out.println("Constructor with char");
	}
	public static void main(String[] args)
	{
		new ConstructorOverloading_Ass2();
		new ConstructorOverloading_Ass2(9);
		new ConstructorOverloading_Ass2("Assignment");
		new ConstructorOverloading_Ass2('a');
		new ConstructorOverloading_Ass2(true);

	}

}
