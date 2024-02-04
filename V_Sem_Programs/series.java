import java.util.Scanner;

public class series{
    public static void main(String[] args){
        int a,b,n;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the value of a,b,n");
        a = sin.nextInt();
        b = sin.nextInt();
        n = sin.nextInt();
        int sum = a;
        for(int i=0;i<n;i++){
            sum+=Math.pow(2,i)*b;
            System.out.println(sum+" ");
        }
    }
}