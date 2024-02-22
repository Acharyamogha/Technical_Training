public class KElement {
    static int kthElement(int arr1[], int arr2[], int n, int m, int k) {
        if (n > m) return kthElement(arr2, arr1, m, n, k);
        if (n == 0) return arr2[k - 1];
        if (k == 1) return Math.min(arr1[0], arr2[0]);
        int i = Math.min(n, k / 2), j = Math.min(m, k / 2);
        if (arr1[i - 1] > arr2[j - 1]) {
            return kthElement(arr1, Arrays.copyOfRange(arr2, j, m), n, m - j, k - j);
        } else {
            return kthElement(Arrays.copyOfRange(arr1, i, n), arr2, n - i, m, k - i);
        }
    }

    public static void main(String[] args) {
        int[] arr4_1 = {2, 3, 6, 7, 9};
        int[] arr4_2 = {1, 4, 8, 10};
        int res4_1 = kthElement(arr4_1, arr4_2, arr4_1.length, arr4_2.length, 5);
        System.out.println("Kth Element: " + res4_1);
    }
}
