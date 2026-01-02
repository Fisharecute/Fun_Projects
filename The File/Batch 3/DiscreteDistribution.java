public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        int[] s = new int[a.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            if (i != 0) { s[i] = a[i] + s[i - 1]; }
            else { s[i] = a[i]; }
        }
        for (int i = 0; i < m; i++) {
            int rando = (int) (Math.random() * s[s.length - 1] + 1);
            for (int j = 0; j < s.length; j++) {
                if (rando <= s[j]) {
                    System.out.print(j + 1 + " ");
                    break;
                }
            }
        }
    }
}