public class BandMatrix {
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        String outputString = "";
        int i = 0;
        
        for (int o = 0; o < width; o++) {
            i = o;
            if (i > 0) {
                for (; i > 0; i--) {
                    if (i <= n) {
                        outputString = outputString + "*  ";
                    } else {
                        outputString = outputString + "0  ";
                    }
                }
            }
                for (; i < width - o; i++) {
                    if (i <= n) {
                        outputString = outputString + "*  ";
                    } else {
                        outputString = outputString + "0  ";
                    }
                }
            System.out.println(outputString);
            outputString = ""; 
        }
    }
}