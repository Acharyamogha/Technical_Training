import java.util.Scanner;

public class TeenSum{
	public static void main(String[] args){
		int a,b,c,res;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter the Three Numbers:");
		a=sin.nextInt();
		b=sin.nextInt();
		c=sin.nextInt();
		res=noTeenSum(a,b,c);
		System.out.println("Sum after fixing teen is: "+res);
	}
	public static int noTeenSum(int a, int b, int c){
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}
	public static int fixTeen(int n){
		if((n>=13 && n<=14) || (n>=17 && n<=19)){
			return 0;
		}
		return n;
	}
}