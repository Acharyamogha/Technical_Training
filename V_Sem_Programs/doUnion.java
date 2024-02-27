public class Solution {
    public int doUnion(int a[], int n, int b[], int m) {
        boolean[] visited = new boolean[100001]; 
        int unionCount = 0;
        
        for (int i = 0; i < n + m; i++) {
            if (i < n && !visited[a[i]]) {
                unionCount++;
                visited[a[i]] = true;
            } else if (i >= n && !visited[b[i - n]]) {
                unionCount++;
                visited[b[i - n]] = true;
            }
        }
        
        return unionCount;
    }
}
