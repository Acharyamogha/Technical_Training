import java.util.Scanner;
public class mthfunc2
{
	public static void main(String[] args) {
	// x=(log(a)+ log10(b)+ e^a)/(a^b+cbrt(a)+tan(a))
	Scanner sin = new Scanner(System.in);
	double x,a,b;
	a=sin.nextDouble();
	b=sin.nextDouble();
	x=(Math.log(a)+Math.log10(b)+Math.exp(a))/(Math.pow(a,b)+Math.cbrt(a)+Math.tan(a));
	System.out.print(x);
	}
}
