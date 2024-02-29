package assignments;
class Parent_Class4
{
	void add()
	{
		
	}
}
class Parent_Class3 extends Parent_Class4
{
	void sub()
	{
		
	}
	
}

class Parent_Class2 extends Parent_Class3
{
	void mutiple()
	{
		
	}
	
}
public class Upcast_Downcast extends Parent_Class2
{
	void divide()
	{
		
	}

	public static void main(String[] args)
	{
		Parent_Class3 p2 =(Parent_Class3) new Parent_Class4();//upcasting of c3 to c4
		p2.sub();
		p2.add();
		//Parent_Class3 p3 = new Parent_Class2(); //upcasting of c2 to c3
		//p3.sub();
		//p3.add();
		
		Parent_Class2 P4 = (Parent_Class2) p2;// downcasting c3 to c2
		P4.add();
		P4.mutiple();
		
		
		
		
		

	}

}
