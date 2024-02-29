package assignments;
import java.util.Scanner;

interface one_parent 
{
	
	void add();
}

interface two_parent 
{
	void sub();
	
}
interface third_parent
{
	void modulus();
}
interface four_parent 
{
	void and_operator();
}
interface five_parent
{
	void or_operator();
}
public class Five_Interface_Ass32 implements one_parent,two_parent,third_parent,four_parent,five_parent
{
	//static final Scanner a = new Scanner(System.in);
	//static final int num1 = a.nextInt();
	//static final int num2 = a.nextInt();

	void mutiple()
	{
		 Scanner a = new Scanner(System.in);
		 int num1 = a.nextInt();
		 int num2 = a.nextInt();
		
		System.out.println(num1*num2);
	}
void divide()
{
	 Scanner a = new Scanner(System.in);
	 int num1 = a.nextInt();
	 int num2 = a.nextInt();
	
	System.out.println(num1/num2);
}
	public static void main(String[] args)
	{
		Five_Interface_Ass32 b = new Five_Interface_Ass32();
		b.add();
		b.divide();
		b.sub();
		b.mutiple();
		b.and_operator();
		b.or_operator();
		b.modulus();

	}
	@Override
	public void sub() {
		 Scanner a = new Scanner(System.in);
		 int num1 = a.nextInt();
		 int num2 = a.nextInt();
		
		System.out.println(num1-num2);
		
	}
	@Override
	public void add()
	{
		 Scanner a = new Scanner(System.in);
		 int num1 = a.nextInt();
		 int num2 = a.nextInt();
		
		System.out.println(num1+num2);
		
	}
	@Override
	public void or_operator()
	{
		 Scanner a = new Scanner(System.in);
		 int num1 = a.nextInt();
		 int num2 = a.nextInt();
		 if (num1>num2 || num1 ==num2)
{
			 System.out.println(true);
	
}
		 else 
		 {
			 System.out.println(false);
}
		
		
		
	}
	@Override
	public void and_operator() 
	{
		Scanner a = new Scanner(System.in);
		 int num1 = a.nextInt();
		 int num2 = a.nextInt();
		 if (num1>num2 && num1 ==num2)
{
			 System.out.println(true);
	
}
		 else 
		 {
			 System.out.println(false);
}
		
	}
	@Override
	public void modulus() 
	{
		Scanner a = new Scanner(System.in);
		 int num1 = a.nextInt();
		 int num2 = a.nextInt();
		 

			 System.out.println(num1%num2);
	

	
		
	}






	}


