public class Arrcheck {
    public static void main(String[] args) {
        int[] arr={12,2,4,6,8,10};
        if(check(arr,0)){
            System.out.println("Array is sorted");
        }
        else System.out.println("Array is not sorted");
    }
    static boolean check(int[] arr, int k){
        if(k==arr.length-1){
            return true;
        }
        if(arr[k]<arr[k+1]){
            return check(arr,k+1);
        }
        else{
            return false;
        }
    }
}