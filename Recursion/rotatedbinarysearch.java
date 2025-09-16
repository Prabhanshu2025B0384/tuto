public class rotatedbinarysearch{
    public static void main(String[] args){
        int[] arr={6, 7, 8, 9, 1, 2, 3, 4, 5};
        System.out.println(search(arr,0,arr.length-1,9));
    }

    static int search(int[] arr,int s ,int e, int t){
        //base case
        if(s>e){
            return -1;
        }
        //mid pointer calculation
        int m=(s+e)/2;
        if(arr[m]==t){
            return m;
        }
        //check if the left half is sorted
        if(arr[s]<arr[m]){
            //check if the element lies in the left half , if it does then enter the left half
            if(t>=arr[s]&&t<=arr[m]){
                return search(arr,s,m-1,t);

            }
            //in case if the element is not in the left half
            else{
                return search(arr,m+1,e,t);
            }

        }
        //check if the right half is sorted
        if(arr[m]<arr[e]){
            //check if the element lies in the right half if it does enter it
            if(t>=arr[m]&&t<=arr[e]){
                return search(arr,m+1,e,t);
            }
            //enter left half if it doesnt
            else{
                return search(arr,s,m-1,t);
            }
        }
        return -1;


    }
}