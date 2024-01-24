import java.util.Scanner;

public class evenodd
{
public static void main(String[] args) {
   Scanner sin=new Scanner(System.in);
   int n = sin.nextInt();
   EvenorOdd(n);
 
}
static void EvenorOdd(int n){
   switch(n&1){
       case 0: System.out.println("Even");
               break;
       case 1: System.out.print("Odd");
               break;
   }
}
}