import java.util.Arrays;

public class bublysort{
    public static void main(String[] args){
        int[] arr={1,4,3,67,34};
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean swap =true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap =false;
                }
            }
            if(swap){
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}