public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int powTwo = 0;
        for (int i = 0; i < n*2; i++) {
            powTwo = (int) Math.pow(2, i);
            if (powTwo > n*2) { break; }
        }
        boolean[] prodded = new boolean[powTwo];
        prodded[0] = false;
        for (int i = 0; i < n; i++) {
            int grugPowTwo = (int) Math.pow(2, i);
            if (grugPowTwo > n) { break; }
            for (int j = 0; j < grugPowTwo; j++) {
                prodded[grugPowTwo + j] = !prodded[j];
            }
        }
        for (int i = 0; i < n; i++) {
            if (prodded[i]) {
                for (int j = 0; j < n; j++) {
                    String tempo = (prodded[j]) ? "+  " : "-  ";
                    System.out.print(tempo);
                }
            } else if (!prodded[i]) {
                for (int j = 0; j < n; j++) {
                    String tempo = (prodded[j]) ? "-  " : "+  ";
                    System.out.print(tempo);
                }
            }
            System.out.println();
        }
    }
}