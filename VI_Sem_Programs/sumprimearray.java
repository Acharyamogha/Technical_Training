import java.util.Arrays;
import java.util.Scanner;
public class sumprimearray {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sin.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sin.nextInt();
        }
        int largestPrime = findLargestPrimeSum(arr);
        
        if (largestPrime != -1) {
            System.out.println("The largest prime number formed by the sum of any two elements is: " + largestPrime);
        } else {
            System.out.println("No prime number found from the sum of any two elements.");
        }
    }
    private static int findLargestPrimeSum(int[] arr) {
        int largestPrime = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (isPrime(sum) && sum > largestPrime) {
                    largestPrime = sum;
                }
            }
        }
        return largestPrime;
    }   
    private static boolean isPrime(int num) {
        for (int i = 2; i<= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
