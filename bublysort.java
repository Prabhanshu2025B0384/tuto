public class bublysort{
    public static void main(String[] args){
        int arr[]={3,1,5,4,2,56,34,-123,45,232323,-343499349};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
}