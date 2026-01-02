public class WorldMap {
    public static void main(String[] args) {
        int x = StdIn.readInt();
        int y = StdIn.readInt();
        StdDraw.setCanvasSize(x, y);
        StdDraw.setXscale(0, x);
        StdDraw.setYscale(0, y);
        boolean xOrY = false;

        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int vertAmnt = StdIn.readInt();
            double xx[] = new double[vertAmnt];
            double yy[] = new double[vertAmnt];
            for (int i = 0; i < vertAmnt; i++) {
                xOrY = !xOrY;
                xx[i] = StdIn.readDouble();
                yy[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xx, yy);
        }
    }
}