public class Binarysearchrecursion{
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        System.out.println(sea(arr,0,arr.length-1,10));
    }
    static int sea(int[] arr,int s , int e,int t){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(arr[mid]==t){
            return mid;
        }
        if(arr[mid]>t){
            return sea(arr,s,mid-1,t);
        }
        else{
            return sea( arr,mid+1,e,t);
        }
    }
}