
public class countsort{
    public static void main(String[] args){
        int[] arr={7, 2, 9, 1, 5, 0, 3, 8, 4, 6};
        int n=arr.length;
        int i=0;
        while(i!=n-1&&arr[i]!=i){
            int temp =arr[arr[i]];
            arr[arr[i]]=arr[i];
            arr[i]=temp;
            if(arr[i]==i){
                i++;
            }
        }
     
     for(int nums:arr){
        System.out.println(nums);
     }
    
 }
}
