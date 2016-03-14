import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int temp=0, c;
		System.out.print("Enter how many numbers you will input: ");
		c=in.nextInt();
		int[] Arr=new int[c];
		
		for(int x=0;x<c;x++) {
		System.out.print("Enter your number: "); 
		Arr[x]=in.nextInt(); 
			}
		
		for(int w=c-1;w>0;w--) {
			for(int u=0;u<w;u++) {
			if(Arr[u]>Arr[u+1]) {
			temp=Arr[u];
			Arr[u]=Arr[u+1];
			Arr[u+1]=temp; 
				} 
			}
		}

			for(int z=0;z<c;z++) {
			System.out.print(Arr[z]); 
				}
	}
}