package simpletasks.task4;

public class ExchangesList {

    public static String exchanges(long number) {
        //По заданию должна возвращать, лучше б печатать в консоль или хранить как класс в коллекции
        return exchanges3_5(number).append(exchanges3_5_7(number)).toString();
    }

    private static StringBuilder exchanges3_5_7(long number) {
        String format = number + " = 3 * %d + 5 * %d + 7 * %d\n";
        StringBuilder result = new StringBuilder();

        long valSeven = number;
        for (int sevenCount = 0; valSeven >= 0 ; sevenCount++, valSeven -= 7) {

            long valFive = valSeven;
            for (int fiveCount = 0; valFive >= 0; fiveCount++, valFive -= 5) {

                long valThree = valFive;
                for (int threeCount = 0; valThree >= 0; threeCount++, valThree -= 3) {

                    if (valThree == 0) {
                        result.append(String.format(format, threeCount, fiveCount, sevenCount));
                    }
                }
            }
        }
        return result;
    }

    private static StringBuilder exchanges3_5(long number) {
        String format = number + " = 3 * %d + 5 * %d\n";
        StringBuilder result = new StringBuilder();

        long valFive = number;
        for (int fiveCount = 0; valFive >= 0; fiveCount++, valFive -= 5) {

            long valThree = valFive;
            for (int threeCount = 0; valThree >= 0; threeCount++, valThree -= 3) {
                if (valThree == 0) {
                    result.append(String.format(format, threeCount, fiveCount));
                }
            }
        }
        return result.append("____________________________________\n");
    }

}
