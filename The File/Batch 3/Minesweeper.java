public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        byte[][] sweepGrid = new byte[m][n];
        int yPos = 0;
        int xPos = 0;

        for (int i = 0; i < k; i++) {
            yPos = (int) (Math.random() * m);
            xPos = (int) (Math.random() * n);
            if (sweepGrid[yPos][xPos] > 8) { k++; }
            else {sweepGrid[yPos][xPos] = 9;
                for (int j = -1; j < 2; j++) {
                    for (int t = -1; t < 2; t++) {
                        if ((yPos + j) > -1 && (xPos + t) > -1 && (yPos + j) < sweepGrid.length && (xPos + t) < sweepGrid[0].length) {
                                sweepGrid[yPos + j][xPos + t] += 1;
                            }
                        }
                    }
                }
            }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ( sweepGrid[i][j] > 8) {System.out.print("*  "); }
                else { System.out.print(sweepGrid[i][j] + "  "); }
            }
            System.out.println();
        }
    }
}