import java.util.*;
public class Array7 {
	public static void main(String[] args)
	{
		//Initialization
		int n=0, ctr=0, sum=0, y=0;
		Scanner in=new Scanner(System.in);
		//input
		System.out.print("Enter a number of input: ");
		n=in.nextInt();
		n--;
		//process
		int num[]=new int[n];
		for(int i=0;i<=n;i++)
		{
			System.out.print("Enter a number: ");
			num[ctr]=in.nextInt();
			if(num[ctr]%9==0)
			y++;		
		}
		//output
		System.out.print("The numbers divisible by 9 is "+y);
	}
}