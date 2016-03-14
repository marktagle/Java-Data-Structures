import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int mis, n, ctr, a=5;
		int arr[]=new int[a];
		String i;
		for(ctr=0;ctr<arr.length;ctr++) {
		System.out.print("Enter a number: "); 
		arr[ctr]=in.nextInt(); }
		System.out.print("Please enter the # of you want to search: ");
		mis=in.nextInt();
		for(n=0;n<a;n++) {
		if(arr[n]==mis) {
		System.out.print("The # "+mis+" is found."); 
		break; } }
		if(n==a)
			System.out.print("The # "+mis+" is not found."); }
}			