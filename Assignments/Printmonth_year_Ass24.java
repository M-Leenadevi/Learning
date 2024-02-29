package assignments;

public class Printmonth_year_Ass24 {

	public static void main(String[] args)
	{
		final int day =365;
		for (int year =1;year<=365;year++)
		{
			if (year <=31)
			{
				System.out.println("January"+year);
			}
			else if (year<=59)
			{
				System.out.println("feb"+year);

			}
			else if (year<=90)
			{
				System.out.println("march"+year);

			}
			else if (year<=120)
			{
				System.out.println("april"+year);

			}
			else if (year<=151)
			{
				System.out.println("may"+year);

			}
			else if (year<=181)
			{
				System.out.println("June"+year);

			}
			else if (year<=212)
			{
				System.out.println("July"+year);

			}
			else if (year<=243)
			{
				System.out.println("Aug "+year);

			}
			else if (year<=273)
			{
				System.out.println("September"+year);

			}
			else if (year<=294)
			{
				System.out.println("october"+year);

			}
			else if (year<=334)
			{
				System.out.println("Nov"+year);

			}
			else if (year<=365)
			{
				System.out.println("december"+year);

			}
		}

	}

}
