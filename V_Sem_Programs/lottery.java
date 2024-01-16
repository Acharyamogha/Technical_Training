import java.util.Scanner;

public class lottery{
	public static void main(String[] args){
		int a,b,c, res=0;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a=sin.nextInt();
		b=sin.nextInt();
		c=sin.nextInt();
		if(a==b&&b==c)
			res=20;
		else if(a==b||a==c||b==c)
			res=10;
		else 
			res=0;
		System.out.println("Result is:"+res);	
	}
}