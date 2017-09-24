public class Frog2{
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
	Frog f=new Frog();
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	System.out.println("jump in Number is :"+f.cal(a,b,c) +"mtrs");
}
}

