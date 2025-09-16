
public class Binarysearch{
    public static void main(String args[]){
        int[] array={10,9,8,7,6,5,4,3,2,1};
        System.out.println(search(array,8));
    }
    static int search(int[] arr,int target){
        boolean type =true;
        if(arr[0]>arr[arr.length-1]){
            type =false;
        }
        int start=0;
        int end =arr.length-1;
        while(start <=end){
            int mid=(start +end)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                if(type){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                } 
            }
            if(target<arr[mid]){
                if(type){
                    end=mid-1;
                }
                else{
                    start =mid+1;
                }
            }
        }
        return -1;
    }
}
