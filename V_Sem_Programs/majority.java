public class Solution {
    public int majority(int[] arr, int n) {
        int majorityElement = arr[0];
        int count = 1;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] == majorityElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = arr[i];
                    count = 1;
                }
            }
        }
        
        count = 0;
        for (int num : arr) {
            if (num == majorityElement) {
                count++;
            }
        }
        
        return count > n / 2 ? majorityElement : -1;
    }
}
