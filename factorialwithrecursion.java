import java.util.Scanner;
class Factorial{

	int fact(int n)
	{   
		
		if(n==1)
		{
			return 1;
			
		}
		else
		{
			return (n*fact(n-1));
		}
	}
}
class recursion
{
	public static void main(String args[])
	{
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		Factorial f=new Factorial();
		System.out.println("The factorial of the number is " +f.fact(n));
	}
}
