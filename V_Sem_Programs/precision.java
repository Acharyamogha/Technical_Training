import java.util.Scanner;

public class precision{
	public static void main(String args[]){
		Scanner sin = new Scanner(System.in);
		float n;
		int p;
		System.out.print("Enter a number: ");
		n=sin.nextFloat();
		System.out.print("Enter the precision: ");
		p=sin.nextInt();
		if(p<7){
			String s=String.format("%."+p+"f",n);
			System.out.print("The number with desired precision is "+s);
		}
		else
			System.out.println("0");
	}
}