public class Binarysearch {
    public static void main(String args[]){
        int arr[]={10,9,8,7,6};
        int k=search(arr,10);
        System.out.print(k);
    }
    public static int search(int[] arr,int target){
        boolean type=false;
        if(arr[0]<arr[arr.length-1]){
            type=true;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            if(type){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    
}