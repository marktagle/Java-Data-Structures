import java.util.*;
public class Array8 {
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
			if(num[ctr]>2000)
			x++;		
		}
		//output
		System.out.print("The numbers greater than 2000 is "+x);
	}
}