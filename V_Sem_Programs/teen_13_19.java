import java.util.Scanner;
public class Main
{   static boolean hasteen(int x,int y,int z)
    {
        boolean a=(((x>=13)&&(x<=19))||((y>=13)&&(y<=19))||((z>=13)&&(z<=19)))?(true):(false);
        return a;
    }
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		int x,y,z;
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
	    boolean b=hasteen(x,y,z);	
		System.out.println(b);
	}
}
