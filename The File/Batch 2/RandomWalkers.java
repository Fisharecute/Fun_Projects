public class RandomWalkers {
    public static void main(String[] args) {
        final int r = Integer.parseInt(args[0]);
        final int trials = Integer.parseInt(args[1]);
        int xPos = 0;
        int yPos = 0;
        int steps = 0;
        double finalSteps = 0;
        boolean keep = true;
        for (int i = 0; i <= trials; i++) {
            finalSteps = finalSteps + steps;
            keep = true;
            steps = 0;
            xPos = 0;
            yPos = 0;
            for (;keep;) {
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
                    steps++;
                } else {
                keep = false;
                }
            }
        }
        finalSteps = finalSteps / trials;
        System.out.println("average number of steps = " + finalSteps);
    }
}