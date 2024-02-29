package assignments;
import java.util.Arrays;
import java.util.Scanner;


public class Check_Two_Arrays_Equals_Ass36 {


	public static void main(String[] args)
	{
		int a [] =new int[3];
		int c [] =new int[3];
		/*a[0] = 90;
		a[1] = 80;
		a[2] = 100;

		c[0] = 90;
		c[1] = 80;
		c[2] = 100;*/

		System.out.println("Enter 3 Arrays for set 1:");
		a = getarrays(a);
		System.out.println("Enter 3 Arrays for set 2:");
		c = getarrays(c);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
		//System.out.println(Arrays.equals(a, c) ? "Equal" : "Not Equal");
		
	if ((Arrays.equals(a, c)== true))
	{
		System.out.println("give strings are equals");
	}
	else 
	{
	System.out.println("give strings are not equals");	}
	}

	private static int[] getarrays(int[] a) {
		Scanner b = new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			a[i] = b.nextInt();
			
		}
		return a;
		
	}

}
