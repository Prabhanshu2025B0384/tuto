public class Paindrome{
    public static void main(String[] args) {
        String p="holaoh";
        boolean pa=false;
        for(int i=0;i<p.length()/2;i++){
            pa= p.charAt(i) == p.charAt(p.length() - i - 1);

        }
        System.out.print(pa?"Palindrome":"NOt Palindrome");

    }
}

