public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) { x = Double.NaN; }
        else {
            if (x < 0) { x = 0; }
            else if (x == 0) { x = 0.5; }
            else if (x > 0) { x = 1; }
        }
        return x;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) { x = Double.NaN; }
        else {
            x = 1/(1 + Math.exp(-x));
        }
        return x;
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (x >= 20) { x = 1.0; }
        else if (x <= -20) { x = -1.0; }
        else {
            if (Double.isNaN(x)) { x = Double.NaN; }
            else { x = ((Math.exp(x) - Math.exp(-x))/(Math.exp(x) + Math.exp(-x))); }
        }
        return x;
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (x == Double.POSITIVE_INFINITY) { x = 1.0; }
        else if (x == Double.NEGATIVE_INFINITY) { x = -1.0; }
        else {
            if (Double.isNaN(x)) { x = Double.NaN; }
            else {
                x = x / (1 + Math.abs(x));
            }
        }
        return x;
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) { x = Double.NaN; }
        else {
            if (x <= -2) { x = -1; }
            else if (-2 < x && x < 0) { x = x + Math.pow(x, 2)/4; }
            else if (0 <= x && x < 2) { x = x - Math.pow(x, 2)/4; }
            else if (x >= 2) { x = 1; }
        }
        return x;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + x + ") = " + heaviside(x));
        StdOut.println("  sigmoid(" + x + ") = " + sigmoid(x));
        StdOut.println("     tanh(" + x + ") = " + tanh(x));
        StdOut.println(" softsign(" + x + ") = " + softsign(x));
        StdOut.println("     sqnl(" + x + ") = " + sqnl(x));
    }
}

//good