import java.util.Scanner;
public class Frog{
	int count,distance;
	public int cal(int height,int jump,int slip)
	{
 		while(distance<=height)
	{
		distance=distance+jump;
		distance=distance-slip;
		count++;
	}
		return count;
}
public static void main(String[] args)
	{	
		 int x;int y;int z;
		Frog d=new Frog();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of Wall in mtrs");
			x=sc.nextInt();
		System.out.println("Enter the jump mtrs");
			y=sc.nextInt();
		System.out.println("Enter the Slip mtrs");
			z=sc.nextInt();
		System.out.println("jump in Number is :"+d.cal(x,y,z) +"mtrs");
	}
}
