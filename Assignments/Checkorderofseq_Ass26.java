package assignments;

public class Checkorderofseq_Ass26 {


		Checkorderofseq_Ass26(int a , int b)
		{
			System.out.println("this is constructor with paramater");
			int c =a+b;
			System.out.println(c);
		}
		static 
		{
			System.out.println("this is SIB");
		}
		{
			System.out.println("this is IIB");
		}

		public static void main(String[] args)
		{
			System.out.println("this is main method");
			new Checkorderofseq_Ass26(9,10);
			new Checkorderofseq_Ass26(9,10);
			
	}
		static 
		{
			System.out.println("this is SIB");
		}
		}


