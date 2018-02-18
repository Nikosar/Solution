package hardtask;

public class Functions {

    public static String functionSwitch(String command, String[] arguments) {
        switch (command) {
            case "F":
                int value = Integer.parseInt(arguments[0]);
                return "" + factorial(value);

            case "FIB":
                int N = Integer.parseInt(arguments[0]);
                return "" + fib(N);

            case "ACK":
                int m = Integer.parseInt(arguments[0]);
                int n = Integer.parseInt(arguments[1]);
                if (m < 0 || n < 0) throw new IllegalArgumentException("ackermann function of negative numbers");
                return "" + ackermann(m, n);

            default:
                return command + " function not found";
        }

    }

    private static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (m > 0 && n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    /*private static long fib(int value) {
        if (value < 2) return value;
        return fib(value - 1) + fib(value - 2);
    }*/

    private static long fib(int N) {
        if (N < 0) throw new IllegalArgumentException("Fibonacci function of negative number");
        if (N < 2) return N;
        long[] val = {0, 1, 1};
        for (int i = 2; i < N; i++) {
            val[0] = val[1];
            val[1] = val[2];
            val[2] = val[0] + val[2];
        }
        return val[2];
    }

    private static long factorial(int value) {
        if (value < 0) throw new IllegalArgumentException("Factorial of negative number");
        if (value < 2) return 1;
        long result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
