import java.util.Scanner;

public class Sumof13{
	public static void main(String[] args){
		int a,b,c,sum=0;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a=sin.nextInt();
		b=sin.nextInt();
		c=sin.nextInt();
		if(a==13)
			sum=0;
		else if(b==13)
			sum=a;
		else if(c==13)
			sum=a+b;
		else 
			sum=a+b+c;
		System.out.println("Sum is: "+sum);	
	}
}