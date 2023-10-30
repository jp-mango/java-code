public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.57);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return (-1);
        } else {
            long mph = Math.round(kilometersPerHour * .621371);
            return mph;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
