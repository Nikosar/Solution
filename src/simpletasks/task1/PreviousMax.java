package simpletasks.task1;

public class PreviousMax {

    public static long previousMax(long... values) {
        if (values.length < 2) throw new IllegalArgumentException("Expect at least 2 numbers");
        long result = Long.MIN_VALUE;
        long max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                result = max;
                max = values[i];
            } else if (values[i] > result && values[i] < max){
                result = values[i];
            }
        }
        return result;
    }
}


