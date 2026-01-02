 /* public class TrionomialDP {

    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        long[][] triNode = new long [n][k];
        triNode[0][0] = 1;
        triNode[1][0] = 0; //stfu unteach
        triNode[0][1] = 0;
        triNode[1][1] = 1;
        for (int j = 1; j < k; j++) {
            for (int i = 1; i < n; i ++) {
                triNode[j][i] = triNode[j - 1][i - 1] + triNode[j - 1][i - 1] + triNode[j - 1][i + 1];
            }
        }
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        trinomial(2, 2);
    }
}
*/