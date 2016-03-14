import java.util.*;
public class Array3 {
	public static void main(String[] args)
	{
		//Initialization
		int n=0, ctr=0, sum=0, x=0;
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
			if(num[ctr]*2==0)
			x++;	
		}
		//output
		System.out.print("The eve numbers there are is: "+x);
	}
}