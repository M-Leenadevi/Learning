package assignments;

import java.util.Scanner;
public class Scannersingle_Object30 
{
	static Scanner s1 = new Scanner(System.in);
	{
		System.out.println("enter the value a");
	}

	static int a = s1.nextInt();
	{
		System.out.println("enter the value b");
	}
	static int b = s1.nextInt();		

	static void add (int a, int b)

	{
		System.out.println("Output of add method");
		System.out.println (a+b);

	}

	static void subtractor (int a, int b)

	{
		System.out.println("Output of substractor method");
		System.out.println(a-b);

	}

	static void mutiple (int a, int b)

	{
		System.out.println("Output of mutiple method");
		System.out.println(a*b);

	}

	static void divide (int a, int b)

	{
		System.out.println("Output of divide method");
		System.out.println(a/b);

	}


	public static void main(String[] args)
	{
		
		Scannersingle_Object30 ob = new Scannersingle_Object30();
		add(a,b);
		subtractor(a,b);
		mutiple(a,b);
		divide(a,b);


	}

}
//Create class and create 4 methods(add,sub,mul,div),add 2 variables but the input should come from scanner class by creating only one  object