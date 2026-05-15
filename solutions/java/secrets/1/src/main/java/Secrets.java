public class Secrets {
    public static int shiftBack(int value, int amount) {
        int shiftedValue = value >>> amount;
        return shiftedValue;
    }

    public static int setBits(int value, int mask) {
        int setValue = value | mask;
        return setValue;
    }

    public static int flipBits(int value, int mask) {
        int flippedValue = value ^ mask;
        return flippedValue;
    }

    public static int clearBits(int value, int mask) {
        int newMask = ~mask;
        int clearedValue = value & newMask;
        return clearedValue;
    }
}