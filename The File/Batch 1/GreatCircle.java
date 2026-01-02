public class GreatCircle {
    public static void main(String[] args) {
        double xOne = Math.toRadians(Double.parseDouble(args[0]));
        double yOne = Math.toRadians(Double.parseDouble(args[1]));
        double xTwo = Math.toRadians(Double.parseDouble(args[2]));
        double yTwo = Math.toRadians(Double.parseDouble(args[3]));

        double distance = (2.0 * 6371.0) * (Math.asin(Math.sqrt(Math.pow(Math.sin((xTwo - xOne)/2), 2) + (Math.cos(xOne) * Math.cos(xTwo) * Math.pow(Math.sin((yTwo - yOne)/2), 2)))));
        System.out.println(distance + " kilometers");
    }
}
