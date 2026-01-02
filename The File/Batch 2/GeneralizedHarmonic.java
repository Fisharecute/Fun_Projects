public class GeneralizedHarmonic {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double GHN = 0;
        for (int i = 0; i < n; i++) {
            GHN = GHN + 1/Math.pow(1 + i, r);
        }
        System.out.println(GHN);
    }
}