import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 6, 7, 8, 23, 3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int hi) {
        if(low>=hi){
            return;
        }
        int p=arr[(low+hi)/2];
        int s=low;
        int e=hi;

        while(s<=e){
            while(arr[s]<p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(arr[s]>=p && arr[e]<=p){
                int temp =arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,hi);
    }
}
