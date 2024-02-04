import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        int x;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter an integer");
        x = sin.nextInt();
        ReverseOfx(x);
    }
    public static void ReverseOfx(int x){
        int temp, rev=0,n=x;
        n=Math.abs(n);
        while(n>0){
            temp=n%10;
            rev=(rev*10)+temp;
            n/=10;
        }
        if(x>0){
            System.out.println(rev);
        }
        else
        System.out.println(-+rev);
    }
}