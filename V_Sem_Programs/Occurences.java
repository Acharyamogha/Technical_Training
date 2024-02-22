
import java.util.Arrays;

public class Occurences {
    static int[] find(int arr[], int n, int x) {
        int[] result = {-1, -1};
        int first = -1, last = -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        result[0] = first;
        result[1] = last;
        return result;
    }

    public static void main(String[] args) {
        int[] arr2 = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int[] res2 = find(arr2, arr2.length, 5);
        System.out.println("First Occurrence: " + res2[0] + ", Last Occurrence: " + res2[1]);
    }
}
