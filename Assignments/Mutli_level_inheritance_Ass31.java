package assignments;

	class Country
	{
		static void nh_road()
		{
			System.out.println(" this is main road");
		}
		static void road()
		{
			System.out.println(" this is short road");
		}
	}
	class State_class extends Country
	{
		static void state_road()
		{
			System.out.println(" this is state road");	
		}
		static void _road()
		{
			System.out.println(" this is sub_state road");
		}
	}
	public class Mutli_level_inheritance_Ass31 extends State_class
	{
		static void city_road()
		{
		System.out.println(" bang");	
	}
		static void main_city_road()
		{
			System.out.println("sub_ bang");
		}
	
	
	public static void main(String[] args)
	{
		
		nh_road();
		 road();
		 state_road();
		 _road();
		 city_road();
		 main_city_road();
		 
		 
		

	}

}
