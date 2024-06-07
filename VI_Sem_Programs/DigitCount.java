import java.util.Scanner;
class digitCount{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        arr[i]=s.nextInt();
        System.out.println(NumberofDigits(arr, n));
    }
    static boolean NumberofDigits(int[] arr, int n){
        int count=0;
        while(arr[0]>0){
            count++;
            arr[0]/=10;
        }
        for(int i=1; i<n; i++){
            int x=arr[i];
            int curr_count=0;
            while(x>0){
              curr_count++;
              x/=10;
            }
            if(count!=curr_count)
            return false;
        }
        return true;
    }
}