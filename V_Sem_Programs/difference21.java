import java.util.Scanner;

public class difference21{
	public static void main(String[] args) {
        Scanner sin=new Scanner;
        int n;
        System.out.println("Enter a number:");
        n=sin.nextInt();
        System.out.println(diff21(n));
        	}
    static int diff21(int n){
        if(n<21)
            return Math.abs(n-21);
        else    
            return 2*(Math.abs(n-21));
    }
}
