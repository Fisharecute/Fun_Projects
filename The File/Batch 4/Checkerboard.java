public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        boolean tf = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tf) { StdDraw.setPenColor(StdDraw.BLUE); }
                else { StdDraw.setPenColor(StdDraw.LIGHT_GRAY); }
                StdDraw.filledSquare(j + .5, i + .5, .5);
                if (j != n - 1) { tf = !tf; }
            }
        }
    }
}