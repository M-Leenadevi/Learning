package assignments;

import java.util.Scanner;

public class Scanner_Print_100_Ass27 {

	public static void main(String[] args) 
	{
		Scanner c1 = new Scanner (System.in);
		System.out.println("enter the value");
		int num1 =c1.nextInt();
		for (int i=2; i<=99;i++)
		{
			System.out.println(i);
		}
		int num2 =c1.nextInt();
	}

}
//Print values 1 to 100 using for loop, but in this 1 and 100 should be come from scanner class