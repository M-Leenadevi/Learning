package assignments;

public class Palindrome_Ass36 {

	public static void main(String[] args)
	{
		String c[] =new String [5];
		String input ="madam";
		String output ="";
		for (int i=input.length()-1;i>=0 ;i--)
		{
		char char1 = input.charAt(i);
		output =output+char1;
		}
		System.out.println(output);
		
		
		System.out.println(input.equals(output));
		//if (input.equalsIgnoreCase(output))
		//{
		
		//System.out.println("the given string is palidrome");
		//}

	}}

//Question -check if the two string are palindrome or not 
