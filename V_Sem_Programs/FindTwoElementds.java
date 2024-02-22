public class FindTwoElements {
    static int[] findTwoElement(int arr[], int n) {
        int repeating = -1, missing = -1;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0)
                repeating = Math.abs(arr[i]);
            else
                arr[index] = -arr[index];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        return new int[]{repeating, missing};
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 2};
        int[] res1 = findTwoElement(arr1, arr1.length);
        System.out.println("Missing: " + res1[1] + ", Repeating: " + res1[0]);
    }

}