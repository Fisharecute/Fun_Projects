public class TrinomialBrute  {

    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        if (n == 0 && k == 0) { return 1; }
        if (k < -n || k > n) { return 0; }
        else {
            long tCoeff;
            tCoeff = trinomial(n - 1, k - 1) + trinomial(n - 1, k) + trinomial(n - 1, k + 1);
            return tCoeff;
        }
    }
    
    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n  = Integer.parseInt("0");
        int k = Integer.parseInt("0");
        StdOut.println(trinomial(n, k)); 
    }
}
