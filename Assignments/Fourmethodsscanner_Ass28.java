package assignments;

import java.util.Scanner;

public class Fourmethodsscanner_Ass28
{
static void add()
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the input a");
	int num1 =s1.nextInt();
	System.out.println("Enter the input b");
	int num2 =s1.nextInt();
	System.out.println("output");
	int c = num1+num2;
	System.out.println(c);
	}
static void sub()
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the input a");
	int num1 =s1.nextInt();
	System.out.println("Enter the input b");
	int num2 =s1.nextInt();
	System.out.println("output");
	int c = num1-num2;
	System.out.println(c);
	
	}
static void mutiple()
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the input a");
	int num1 =s1.nextInt();
	System.out.println("Enter the input b");
	int num2 =s1.nextInt();
	System.out.println("output");
	int c = num1*num2;
	System.out.println(c);
	
	}
static void divide()
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the input a");
	int num1 =s1.nextInt();
	System.out.println("Enter the input b");
	int num2 =s1.nextInt();
	System.out.println("output");
	int c = num1/num2;
	System.out.println(c);
		}
	public static void main(String[] args) 
	{
		add();
		sub();
		mutiple();
		divide();
		

	}

}


