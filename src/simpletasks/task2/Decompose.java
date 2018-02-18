package simpletasks.task2;

public class Decompose {

    public static String decompose(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("Number must be >= 2");
        }
        String result = "";
        PrimeHolder primeHolder = new PrimeHolder(number);

        while (number != 1) {
            int currentPrime = primeHolder.findNextPrime();
            int divideCount = 0;

            while(number % currentPrime == 0) {
                number /= currentPrime;
                divideCount++;
            }

            if (divideCount != 0) {
                result += currentPrime + " ^ " + divideCount;
                if (number != 1) result += " + ";
            }
        }
        return result;
    }

}

