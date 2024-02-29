package assignments;

public class Find_Special_Character_String {

	public static void main(String[] args)
	{
		int countofdigit =0;
		int countofalpha =0;
		int countofspace =0;
		String input ="auto batch 38 $$$@";
		String special ="$$$@";
		int countofspecialcharacter =0;
		
		char c1[] =input.toCharArray();
		for (int i=0;i<input.length();i++)
		{
			boolean alpha = Character.isAlphabetic(c1[i]);
			boolean digit =Character.isDigit(c1[i]);
			boolean space =Character.isWhitespace(c1[i]);
			if (alpha ==true)
			{
				countofalpha++;
			}
			else if (digit ==true)
			{
				countofdigit++;
			}
			else if (space ==true)
			{
				countofspace++;
			}
			else
			{
				countofspecialcharacter =input.length()-((countofdigit)+(countofalpha)+(countofspace));
				//countofspecialcharacter++;
			}
		}
		System.out.println("My given of the string" +input+"has"+countofdigit+"Digit in it");
		System.out.println("My given of the string"+input+"has"+countofalpha+"alpha in it");
		System.out.println("My given of the string"+input+"has"+countofspace+"space in it");
		System.out.println("My given of the string"+input+"has"+countofspecialcharacter+"special character in it");
		
		System.out.println("index of special character"+input.indexOf(special) );
	
		
		if (input.length()== (countofdigit)+(countofalpha)+(countofspace))
			
		{
			System.out.println(" No Special char in it");
		
		}
		else 
			
		{
			System.out.println(" Special char found");
		}
	}

}



