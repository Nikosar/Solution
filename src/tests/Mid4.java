package tests;

import middletasks.task4.ExchangesCount;

import java.util.Arrays;

public class Mid4 {
    public static void main(String[] args) {
        print(35, new int[] {3, 5, 7});
        print(100, new int[] {2, 5, 10, 50});
        print(10, new int[] {3});
        print(85, new int[] {1});
        print(1, new int[] {3, 25});
        print(-10, new int[] {3});
        print(71, new int[] {});

    }

    public static void print(int number, int[] values) {
        System.out.println("Exchange count " + number + " on "
                + Arrays.toString(values) + " = " + ExchangesCount.exchangeCount(number, values));
    }
}
