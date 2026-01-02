public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] amplified = new double[a.length];
        for (int i = 0; i < amplified.length; i++) { amplified[i] = a[i] * alpha; }
        return amplified;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] reversed = new double[a.length];
        int j = a.length - 1;
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = a[j];
            j--;
        }
        return reversed;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] merged = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) { merged[i] = a[i]; }
        for (int i = a.length; i < merged.length; i++) { merged[i] = b[i - a.length]; }
        return merged;
    }


    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] mixed;
        double[] aPadded; // potentially useless: fix later?
        double[] bPadded; // potentially useless: fix later?
        if (a.length >= b.length) {
            mixed = new double[a.length];
            bPadded = new double[a.length];
            for (int i = 0; i < b.length; i++) { bPadded[i] = b[i]; }
            for (int i = b.length; i < mixed.length; i++) { bPadded[i] = 0.0; }
            for (int i = 0; i < mixed.length; i++) { mixed[i] = a[i] + bPadded[i]; }
        } else { 
            mixed = new double[b.length];
            aPadded = new double[b.length];
            for (int i = 0; i < a.length; i++) { aPadded[i] = a[i]; }
            for (int i = a.length; i < mixed.length; i++) { aPadded[i] = 0.0; }
            for (int i = 0; i < mixed.length; i++) { mixed[i] = b[i] + aPadded[i]; }
        }
        return mixed;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] speeded = new double[(int) Math.floor(a.length/alpha)];
        int j = 0;
        for (double i = 0; i < a.length; i += alpha) {
            if (j >= speeded.length) { break; }
            speeded[j] = a[(int) Math.floor(i)];
            j++;
        }
        return speeded;
    }


    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        StdAudio.play(merge(changeSpeed(mix(reverse(amplify(StdAudio.read("singer.wav"), .1)), changeSpeed(StdAudio.read("exposure.wav"), 2)), .97), mix(changeSpeed(mix(reverse(StdAudio.read("piano.wav")), amplify(StdAudio.read("harp.wav"), 20)), .97), changeSpeed(amplify(StdAudio.read("dialup.wav"), .01), 2))));
    }
}

//fixed