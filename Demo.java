import java.util.Scanner;
public class Demo
{
	public int multiply(int a,int b,int c)
	{
		int d=a*b*c;
		return d;
	}
public static void main(String[] args)
	{	
		 int x;int y;int z;
		Demo demo=new Demo();
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter First Number");
			x=sc.nextInt();
		System.out.println("Enter Second Number");
			y=sc.nextInt();
		System.out.println("Enter Third Number");
			z=sc.nextInt();
		System.out.println("Multiplication of Number:"+demo.multiply(x,y,z));

	}
}
