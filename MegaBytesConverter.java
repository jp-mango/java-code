public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int originalKiloBytes = kiloBytes;
            int megaBytes = 0;
            while (kiloBytes >= 1000) {
                kiloBytes -= 1000;
                megaBytes++;
            }
            System.out.println(originalKiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes + " KB");
        }
    }
}
