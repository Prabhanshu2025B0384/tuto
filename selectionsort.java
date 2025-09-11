
import java.util.Arrays;

public class selectionsort{
    public static void main(String[] args){
        int[] a={3,1,5,3,2};
        for(int i=0;i<a.length-1;i++){
            int min=a[i];
            int q=i;
            for(int j=i+1;j<a.length;j++){
                if (a[j]<min){
                    min=a[j];
                    q=j;
                }
            }
            int temp=a[i];
            a[i]=min;
            a[q]=temp;
        }
        System.out.print(Arrays.toString(a));
    }
}