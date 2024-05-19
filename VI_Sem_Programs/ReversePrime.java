import java.util.Scanner;

public class ReversePrime {

    public static boolean isPrime(int num) {
        for (int i = 2; i <=num/2; i ++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sin.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < n; i++) {
            array[i] = sin.nextInt();
        }
        
        System.out.println("Prime elements whose reverse is also a prime number:");
        for (int num : array) {
            if (isPrime(num)) {
                int reversed = reverseNumber(num);
                if (isPrime(reversed)) {
                    System.out.println(num);
                }
            }
        }
    }
}
