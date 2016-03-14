import java.util.*;
public class Array9 {
	public static void main(String[] args)
	{
		//Initialization
		int ctr=0, x;
		Scanner in=new Scanner(System.in);
		//input
		System.out.print("Enter a number of input: ");
		x=in.nextInt();
		//process
		int num[]=new int[x];
		for(x=0;x<num.length;x++)
		{
			System.out.print("Enter a number: ");
			num[x]=in.nextInt();
			if(num[ctr]/4==0) {
			x++; }
		}
		//output
		System.out.print("There are "+ctr+" leap years.");
	}
}