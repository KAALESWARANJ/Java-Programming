import java.util.Scanner;
class SwapUsingTemp{
	public static void main(String args[])
	{
		int a,b,temp;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a is : " +a);
		System.out.println("The value of b is : " +b);
		
		
	}
}
