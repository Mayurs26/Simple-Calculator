import java.util.Scanner;
class Calculator
{
	static int data =0;
	static Scanner sc=new Scanner(System.in);
	public static void add()
	{
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		data=a+b;
		System.out.println(data);
	}
	public static void sub()
	{
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		data=a-b;
		System.out.println(data);
	}
	public static void mul()
	{
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		data=a*b;
		System.out.println(data);
	}
	public static void quo()
	{
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		data=a/b;
		System.out.println(data);
	}
	public static void rem()
	{
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		data=a%b;
		System.out.println(data);
	}
	
}
class CalsiDriver
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
			System.out.println("1. add 2. sub 3. mul 4. quo 5. rem 6. exit");
			int menu=sc.nextInt();
			switch(menu)
			{
				case 1: Calculator.add();
				break;
				case 2: Calculator.sub();
				break;
				case 3: Calculator.mul();
				break;
				case 4: Calculator.quo();
				break;
				case 5: Calculator.rem();
				break;
				case 6: System.exit(1);
				break;
			}
		}
	}
}