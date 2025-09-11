public class NonTailnRecursivePatter {
    public static void main(String[] args) {
        int n = 5; // Number of symbols to print
        printSymbols(n);
    }

    static void printSymbols(int n) {
        if (n == 0) return;
        printSymbols(n - 1); // Recursive call (not tail)
        System.out.println("★");
    }
}
