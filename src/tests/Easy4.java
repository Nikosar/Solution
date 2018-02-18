package tests;

import simpletasks.task4.ExchangesList;

public class Easy4 {
    public static void main(String[] args) {
        int[] numbers = {-7, 4, 15, 21, 23, 35, 1, 68};

        for (int number :
                numbers) {
            System.out.println("Exchange variants " + number + ":\n" + ExchangesList.exchanges(number));
        }

    }
}
