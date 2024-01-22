import java.util.Scanner;

public class vacation_weekday
{
	public static void main(String[] args) {
        Scanner sin=new Scanner;
        boolean v=true,w=false;
        System.out.println(sleepIn(v,w));
    }
    static bool sleepIn(boolean w, boolean v){
        return !w||v;
    }
}