public class ShannonEntropy {
    public static void main(String[] args) {
        int grinka[] = StdIn.readAllInts();
        int maxun = 0;
        for (int i = 0; i < grinka.length; i++) {
            if (grinka[i] > maxun) { maxun = grinka[i]; }
        }
        int numCount[] = new int[maxun + 1];
        int numCountSum = 0;
        for (int i = 0; i < grinka.length; i++) { numCount[grinka[i]] += 1; }
        for (int i = 0; i < maxun + 1; i++) { numCountSum += numCount[i]; }
        double numProportion[] = new double[maxun];
        for (int i = 0; i < maxun; i++) {
            if (numCount[i + 1] > 0) { numProportion[i] = (double) numCount[i + 1] / numCountSum; }
            else { numProportion[i] = 0; }
        }
        double shannon = 0;
        for (int i = 0; i < maxun; i++) {
            if (numProportion[i] > 0) { shannon += -(numProportion[i]) * Math.log(numProportion[i]) / Math.log(2); }
            else { shannon += 0; }
        }
        StdOut.printf("%.4f %n", shannon);
    }
}