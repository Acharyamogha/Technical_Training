import java.util.Arrays;

public class RearrangeArray {
    static void rearrange(int arr[], int n) {
        int maxIdx = n - 1, minIdx = 0;
        int maxElem = arr[maxIdx] + 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }

    public static void main(String[] args) {
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        rearrange(arr3, arr3.length);
        System.out.println("Rearranged Array: " + Arrays.toString(arr3));
    }
}
