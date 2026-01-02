public class CMYKtoRGB {
    public static void main(String[] args) {
        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);
        //technically unnecessary
        int W = (int) Math.round(1 - K);
        int R = (int) Math.round(255 * W * (1 - C));
        int G = (int) Math.round(255 * W * (1 - M));
        int B = (int) Math.round(255 * W * (1 - Y));
        
        System.out.println("red   = " + R);
        System.out.println("green = " + G);
        System.out.println("blue  = " + B);
    }
}