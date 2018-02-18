package middletasks.task4;

public class ExchangesCount {
    static int[] valuesHolder;

    public static int exchangeCount(long number, int[] parts) {
        valuesHolder = parts;
        return exchangeCount(number, valuesHolder.length - 1);
    }

    private static int exchangeCount(long number, int len) {
        if (number == 0) {
            return 1;
        }

        if (number < 0 || len == -1) {
            return 0;
        }

        return exchangeCount(number, len - 1) + exchangeCount(number - valuesHolder[len], len);
    }
}
