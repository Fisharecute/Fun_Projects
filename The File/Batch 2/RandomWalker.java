public class RandomWalker {
    public static void main(String[] args) {
        final int r = Integer.parseInt(args[0]);
        int xPos = 0;
        int yPos = 0;
        int steps = 0;
        System.out.println("(" + xPos + ", " + yPos + ")");
        for (boolean keep = true; keep;) {
            if (Math.abs(xPos) + Math.abs(yPos) != r) {
                if (Math.random() < .5) {
                    if (Math.random() < .5) {
                        xPos++;
                    } else {
                        xPos--;
                    }
                } else {
                    if (Math.random() < .5) {
                        yPos++;
                    } else {
                        yPos--;
                    }
                }
                System.out.println("(" + xPos + ", " + yPos + ")");
                steps++;
            } else {
                keep = false;
                System.out.println("steps = " + steps);
            }
        }
    }
}