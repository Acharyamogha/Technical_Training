import java.util.Scanner;

public class sqrt{
	public static void main(String args[]){
		Scanner sin = new Scanner(System.in);
		int p;
		System.out.print("Enter a number: ");
		p=sin.nextInt();
		System.out.print((int)Math.sqrt(p));
	}
}