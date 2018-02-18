package tests;

import middletasks.task1.PreviousNmax;

import java.util.Arrays;

public class Mid1 {
    public static void main(String[] args) {
        print(2, new long[]{10, 20, 5, 7, 1, 3, 80, 1, 56, 100});
        print(2, new long[]{100, 20, 5, 7, 1, 3, 80, 1, 56, 100});
        print(8, new long[]{100, 20, 5, 7, 1, 3, 80, 56});
        print(8, new long[]{100, 20, 5, 5, 1, 3, 80, 56});
        print(3, new long[]{100, 100, 100, 100, 100, 100, 100, 100, 101, 98, 0});
        print(3, new long[]{98, 100, 100, 100, 100, 100, 100, 100, 101, 100, 0});
        print(2, new long[]{50, -100});
        print(1, new long[]{-100});
    }

    public static void print(int position, long[] values) {
        System.out.println(position + " number by value in "
                + Arrays.toString(values) + "\nis " + PreviousNmax.previousNMax(position, values));
    }
}
