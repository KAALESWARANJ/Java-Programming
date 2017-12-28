import java.util.Scanner;
class FactorialWithoutRecursion{
	public static void main(String args[]) 
	{
		int i,n,fact=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
		  fact=fact*i;	
		}
		System.out.println("The factorial is " +fact);
		
		
	}
               }
