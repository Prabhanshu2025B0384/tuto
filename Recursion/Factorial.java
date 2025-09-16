public class Factorial {
    public static void main(String[] args) {

        System.out.println(pri(5));
    }

    static int pri(int k) {
        if(k==1){
            return 1;
        }
        return k*pri(k-1);
    }
}