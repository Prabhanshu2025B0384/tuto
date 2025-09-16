import java.util.Arrays;

public class Insertionsort{
    public static void main(String[] args){
        int[] arr={1,4,3,67,34};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int prev=i-1;
            while(prev>=0 && arr[prev]>arr[i]){
                int temp=arr[prev];
                arr[prev]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}