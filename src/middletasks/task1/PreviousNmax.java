package middletasks.task1;

public class PreviousNmax {

    public static long previousNMax(int N, long[] values) {
        if (values.length < N) throw new IllegalArgumentException("Expect at least " + N + " numbers");

        long[] nMax = new long[N];
        nMax[N - 1] = values[0];
        for (int i = 0; i < N - 1; i++) {
            nMax[i] = Long.MIN_VALUE;
        }

        for (int i = 1; i < values.length; i++) {
            for (int j = N - 1; j >= 0; j--) {

                if (values[i] == nMax[j]) break;

                if (nMax[j] < values[i]) {
                    leftShift(j, nMax);
                    nMax[j] = values[i];
                    break;
                }
            }
        }

        return nMax[0];
    }

    private static void leftShift(int j, long[] nMax) {
        for (int i = 1; i < j + 1; i++) {
            nMax[i - 1] = nMax[i];
        }
    }
}
