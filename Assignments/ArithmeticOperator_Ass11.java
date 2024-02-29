package assignments;

public class ArithmeticOperator_Ass11 
{
static void areaofsquare (int a)
{
	int f = a*a;
	System.out.println("area of square ="+f);
}
static void areaofrectangle (int l, int b)
{
	int f = l*b;
	System.out.println("area of rectangle ="+f);
}
static void areaoftriangle (int b, int h)
{
	int f = (b*h)/2;
	System.out.println("area of triangle ="+f);
}
void cirumferenceofcricle (int r)
{
	double f =2*3.14f*r;
	System.out.println("cirumference_of_cricle ="+f);
}
void cirumferenceofsquare (int a)
{
	int  area =4*a;
	System.out.println("cirumference_of_cricle ="+area);
}
void cirumferenceofrectangle (int l , int w)
{
	int rectangle  =2*(l+w);
	System.out.println("cirumference_of_cricle ="+rectangle);
}
	public static void main(String[] args)
	
	{
		areaofsquare(10);
		 areaofrectangle (10,12);
		 areaoftriangle(10,20);
		 ArithmeticOperator_Ass11 a =new ArithmeticOperator_Ass11 ();
		 a.cirumferenceofcricle(10);
		 a.cirumferenceofrectangle(10, 20);
		 a.cirumferenceofsquare(10);
		 
		 

	}

}
