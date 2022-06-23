public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum integer value: " + minIntValue);
        System.out.println("Maximum integer value: " + maxIntValue);
        // overflow
        System.out.println("Busted max int value: " + (maxIntValue + 1));
        // underflow
        System.out.println("Busted min int value: " + (minIntValue - 1));

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum byte value: " + minByteValue);
        System.out.println("Maximum byte value: " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum short value: " + minShortValue);
        System.out.println("Maximum short value: " + maxShortValue);

        // byte: 8 bits
        // short: 16 bits
        // int: 32 bits
        // long: 64 bits

        long myLongValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum long value: " + minLongValue);
        System.out.println("Maximum long value: " + maxLongValue);

        // Casting
        int myTotal = (minIntValue / 2);
        byte newByteValue = (byte) (minByteValue / 2);
        short newShortValue = (short) (minShortValue / 2);

    }
}
