package tests;

import simpletasks.task1.PreviousMax;

import java.util.Arrays;

class Easy1 {

    public static void main(String[] args) {
        print(10, 20, 5, 7, 1, 3, 80, 1, 56, 100);
        print(100, 20, 5, 7, 1, 3, 80, 1, 56, 100);
        print(100, 100, 100, 100, 100, 100, 100, 100, 100, 99);
        print(99, 100, 100, 100, 100, 100, 100, 100, 100, 100);
        print(50, -100);
        print(100, 100);
    }

    public static void print(long... values) {
        System.out.println(2 + " number by value in "
                + Arrays.toString(values) + "\nis " + PreviousMax.previousMax(values));
    }
}
