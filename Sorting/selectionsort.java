
import java.util.Arrays;

public class selectionsort{
    public static void main(String[] args){
        int[] a={3,1,5,3,2};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=a[i];
            int index=i;
            for(int j=i;j<n;j++){
                if(a[j]<min){
                    min=a[j];
                    index=j;
                }
            }
            int temp=a[i];
            a[i]=min;
            a[index]=temp;
        }
        System.out.print(Arrays.toString(a));
    }
}