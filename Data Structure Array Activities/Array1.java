import java.util.*;
public class Array1 {
	public static void main(String[] args)
	{
		//Initialization
		int n=0, ctr=0, sum=0;
		Scanner in=new Scanner(System.in);
		//input
		System.out.print("Enter a number: ");
		n=in.nextInt();
		n--;
		//process
		int num[]=new int[n];
		for(int i=0;i<=n;i++)
		{
			System.out.print("Enter a number: ");
			num[ctr]=in.nextInt();
			sum+=num[ctr];
		}
		//output
		System.out.print("The sum is: "+sum);
	}
}