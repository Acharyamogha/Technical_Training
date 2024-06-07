import java.util.Scanner;

public class brick{
    public static void main(String args[]){
        Scanner sin = new Scanner(System.in);
        int one=sin.nextInt();
        int five=sin.nextInt();
        int wall=sin.nextInt();
        System.out.println(Wall(one, five, wall));
    }
    static boolean Wall(int sb, int lb, int wall){
        int rlb=wall/5;
        int minlb= Math.min(rlb,lb);
        int lwall=wall-(5*minlb);
        return lwall<=sb;
    }
}