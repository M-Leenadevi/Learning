package assignments;
import java.util.Scanner;

public class Swap_TwoNumber_Withvariable_Ass39 
{

	static void swap(int a, int b )
	{
		int Tem;
		Tem =a;
		a =b;
		b = Tem;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args)
	{
	Scanner S = new Scanner (System.in);
	int a =S.nextInt();
	int b =S.nextInt();
	
	swap(a,b);
	

	}

}
