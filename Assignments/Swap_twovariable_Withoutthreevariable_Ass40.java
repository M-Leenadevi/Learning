package assignments;
import java.util.Scanner;

public class Swap_twovariable_Withoutthreevariable_Ass40 {

	public static void main(String[] args)
	{
		//int a =20;
		//int b=30;
		Scanner c =new Scanner(System.in);
		int a =c.nextInt();
		int b =c.nextInt();
		a =a +b;
		b =a -b;
		a= a-b;
		System.out.println("After the swap value of a =" +a);
		System.out.println(" After the swap value of b ="+b);

	}

}
