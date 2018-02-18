package simpletasks.task2;

public class PrimeHolder {
    private final int number;
    private int currentPrime = 1;

    public PrimeHolder(int number) {
        this.number = number;
    }

    public int findNextPrime() {
        for (int i = currentPrime + 1; i <= number; i++) {
            int count = 0;
            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) count++;
            }
            if (count == 0) {
                currentPrime = i;
                return currentPrime;
            }
        }
        return -1;
    }

}
