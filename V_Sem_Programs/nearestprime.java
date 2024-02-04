import java.util.Scanner;
public class nearestprime {
    public static void main(String[] args) {
        int X;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter an integer");
        X=sin.nextInt();
        int prime = NearestPrime(X);
        System.out.println("Nearest prime to " + X + ": " + prime);
    }

    private static int NearestPrime(int X) {
        int sp = X;
        int lp = X;

        while (!isPrime(sp) && !isPrime(lp)) {
            sp--;
            lp++;
        }

        return isPrime(sp) ? sp : lp;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
