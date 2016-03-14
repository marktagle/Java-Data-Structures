import java.util.Scanner;
public class JavaCalculator {
	public static void main(String[] args) {
		
		//initialization
		int num1=0, num2=0, add=0, sub=0, mul=0;
		double div=0, modiv=0;
		String tot="";
		Scanner in=new Scanner(System.in);
		
		//input
		System.out.println("Java Simple Calculator");
		System.out.print("Enter a number: ");
		num1=in.nextInt();
		System.out.print("The operator is: ");
		tot=in.next();
		System.out.print("Enter a number: ");
		num2=in.nextInt();
		
		//process
		if(tot.equals("+")) {
			int ctr=add(num1,num2); 
		System.out.print("The answer is: "+ctr); 
			}
		
		else if(tot.equals("-")) {
			int dif=sub(num1,num2);
		System.out.print("The difference is: "+dif); 
			}	
			
		else if(tot.equals("*")) {
			int prod=mul(num1,num2);
		System.out.print("The product is: "+prod); 
			}	
			
		else if(tot.equals("/")) {
			double quo=div(num1,num2);
		System.out.print("The quotient is: "+quo);
		 }	
			
		else if(tot.equals("%")) {
			double modivi=modiv(num1,num2);
		System.out.print("The modulo is: "+modivi); 
			}	
	}					
		static int add(int num1, int num2) {
			return num1+num2; 
				}
		static int sub(int num1, int num2) {
			return num1-num2; 
				}
		static int mul(int num1, int num2) {
			return num1*num2; 
				}
		static double div(double num1, double num2) {
			return num1/num2; 
				}
		static double modiv(double num1, double num2) {
			return num1%num2; 
				}						
}