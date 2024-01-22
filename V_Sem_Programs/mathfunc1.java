import java.util.Scanner;
public class mathfunc1
{
	public static void main(String[] args) {
	// x=sqrt(a^b - sin(b^a) )
	Scanner sin = new Scanner(System.in);
	double x,a,b;
	a=sin.nextDouble();
	b=sin.nextDouble();
	x=Math.sqrt(Math.pow(a,b) - Math.sin(Math.pow(b,a)));
	System.out.print(x);
	}
}