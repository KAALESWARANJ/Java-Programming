import java.util.Scanner;
class PowerOfTheNumber{
	public static void main(String args[])
	{
		int base,exp;
		long res=1;
		Scanner in=new Scanner(System.in);
		base=in.nextInt();
		exp=in.nextInt();
		while(exp!=0)
		{
			res=res*base;
			exp--;
		}
		System.out.println("The power of the number is " +res);
	}
          }
