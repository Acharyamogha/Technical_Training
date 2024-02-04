import java.util.Scanner;
public class primedigsum {
    public static void main(String[] args) {
        int X;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter an integer");
        X=sin.nextInt();
        boolean result = isPrimeDigitSumPrime(X);

        System.out.println("PrimeDigitSum(" + X + ")" + result);
    }

    private static boolean isPrimeDigitSumPrime(int X) {
        int digitSum = PrimeDigitSum(X);
        return isPrime(digitSum);
    }

    private static int PrimeDigitSum(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (isPrime(digit)) {
                sum += digit;
            }

            number /= 10;
        }

        return sum;
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
