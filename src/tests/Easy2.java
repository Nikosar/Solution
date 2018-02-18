package tests;

import simpletasks.task2.Decompose;

public class Easy2 {
    public static void main(String[] args) {
        System.out.println("Decompose by prime numbers: ");
        print(864);
        print(2);
        print(8093);
        print(687905);
        try {
            print(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void print(int number) {
        System.out.println(number + " = " + Decompose.decompose(number));
    }
}
