import java.util.Scanner;

public class ATM
{
public static void main(String[] args) {
   Scanner sin=new Scanner(System.in);
   int PIN=1234, bal=0,choice,p;
   System.out.print("Enter the PIN: ");
   int pin=sin.nextInt();
   if(pin==PIN){
       do{
           System.out.println("1. Deposit\n2.Withdraw\n3. Balance Enquiry\n4. PIN Change\n5. Exit");
           choice=sin.nextInt();
           switch(choice){
               case 1: System.out.print("Enter the amount to be deposited: ");
                        int amt=sin.nextInt();
                        bal = deposit(amt,bal);
                        break;
               case 2:  System.out.print("Enter the amount to Withdraw: ");
                        int wth=sin.nextInt();
                        bal = withdraw(wth,bal);
                        break;
               case 3:  System.out.println("Available Balance is: "+bal);
                        break;
               case 4:  System.out.print("Enter the existing PIN: ");
                        p=sin.nextInt();
                        if(p==PIN){
                        PIN = pinchange(p,PIN);  
                        }
                        else
                        System.out.println("Invalid PIN");
                        break;
               case 5:  System.exit(0);
               default: System.out.println("Invalid Input");
                }
       }while(choice!=5);
   }
   else
   System.out.println("Invalid PIN Number");
 
   }
    static int deposit(int amt, int bal){
        if((amt%100==0)&&(amt>0)){
        bal+=amt;
        System.out.println("Amount deposited is:"+amt);
        System.out.println("Available balance is: "+bal);
        }
        else
        System.out.println("Invalid Amount Entered");
        return bal;
}
    static int withdraw(int wth, int bal){
        if((wth%100==0)&&(wth>0)&&(wth<=bal)){
        bal-=wth;
        }
        else
        System.out.println("Amount entered is invalid or Insufficient balance");
        System.out.println("Available balance is: "+bal);
        return bal;
    }
    static int pinchange(int p, int PIN){
        int pin1, pin2;
        System.out.print("Enter new PIN: ");
        Scanner s=new Scanner(System.in);
        pin1=s.nextInt();
        do{
        System.out.print("Enter PIN to re-confirm: ");
        pin2=s.nextInt();
        if(pin1==pin2){
            System.out.println("PIN changed successfully!!");
            PIN=pin1;
        }
        else{
            System.out.println("PIN does not match... Re-Enter the PIN");
            pin2=s.nextInt();
        }
    }while(pin1!=pin2);
    return PIN;

    }
}