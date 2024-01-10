import java.util.Scanner;

public class Assignment_1 {
	public static void main(String s[]){
		String pwd;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter the password: ");
		pwd=sin.nextLine();
		if(validpwd(pwd))
			System.out.println("1");
		else
			System.out.println("0");
}
	public static boolean validpwd(String pwd){
		boolean upr=false;
		boolean lwr=false;
		boolean dig=false;
		boolean splchr=false;
		if(pwd.length()<8)
			return false;
		for(char c: pwd.toCharArray()){
			if(Character.isUpperCase(c))
				 upr=true;
			else if(Character.isLowerCase(c))
				lwr=true;
			else if(Character.isDigit(c))
				dig=true;
			else if(splchar(c))
				splchr=true;
			if(Character.isWhitespace(c))
				return false;
		
}
		return lwr && upr && dig && splchr;
}
	public static boolean splchar(char c){
		String spch="!@#$%^&*";
		return spch.indexOf(c)!=-1;
}
}

