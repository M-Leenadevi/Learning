package assignments;
import java.util.Arrays;
public class Check_string_only_digits_Ass37 {

	public static void main(String[] args)
	{
		String name ="12345";
		int noofdigit =0;
		
		char a1 [] =name.toCharArray();//Convert tochararray
		System.out.println(Arrays.toString(a1));
		for (int i=0;i<a1.length;i++)
		{
			boolean answer =Character.isDigit(a1[i]);
			
			if (answer ==true)
			{
				noofdigit++;
				
			}}
						
				System.out.println("Number of digits in the string ="  +noofdigit);
	}}
	
			
		
