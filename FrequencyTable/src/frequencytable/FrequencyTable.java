package frequencytable;

public class FrequencyTable {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        for (int noteNumber = 0; noteNumber < 128; noteNumber++) {
            double frequency = 440 * Math.pow(2, (noteNumber - 69) / 12.0);
            int frequencyInt = (int) (1193180 / frequency);

            String frequencyHex = "0000" + Integer.toHexString(frequencyInt);
            frequencyHex = frequencyHex.substring(frequencyHex.length() - 4, frequencyHex.length());

            if (noteNumber % 8 == 0) {
                System.out.print("\r\n\tdb ");
            }

            System.out.print("0" + frequencyHex.subSequence(2, 4) + "h, 0" + frequencyHex.substring(0, 2) + "h" + ((noteNumber % 8 != 7) ? ", " : ""));
        }

        System.out.println("");
    }
}
