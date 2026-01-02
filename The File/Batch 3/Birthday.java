public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] covBday = new int[n*4];
        boolean contLoop = false;
        for (int q = 1; q < n*4; q++) {
            int breakAmnt = 0;
            double fraCalc = 0;
            for (int t = 0; t < trials; t++) {
                contLoop = false;
                for (int i = 0; i < q; i++) {
                    if (!contLoop) {
                        covBday[i] = (int) (Math.random() * n);
                        for (int j = 0; j < i; j++) {
                            if (covBday[i] == covBday[j]) { contLoop = true; }
                        }
                    } if (contLoop) {
                        if (i == q - 1) { breakAmnt += 1; }
                        if (i < q) { fraCalc += 1; }
                        break;
                    }
                }
            }
            System.out.print(q + "\t");
            System.out.print(breakAmnt + "\t");
            System.out.println(fraCalc/trials);
            if (fraCalc/trials >= .5) { break; }
        }
    }
}