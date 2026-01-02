public class RightTriangle {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int GivenHypoteneuse = (int) Math.pow((Math.max(c, Math.max(a, b))), 2);

        int CorrectHypoteneuseOne = (int) (Math.pow(a, 2)) + (int) (Math.pow(b, 2));
        int CorrectHypoteneuseTwo = (int) (Math.pow(b, 2)) + (int) (Math.pow(c, 2));
        int CorrectHypoteneuseThree = (int) (Math.pow(c, 2)) + (int) (Math.pow(a, 2));

        System.out.println(CorrectHypoteneuseOne == GivenHypoteneuse  || CorrectHypoteneuseTwo == GivenHypoteneuse || CorrectHypoteneuseThree == GivenHypoteneuse);
    }
}