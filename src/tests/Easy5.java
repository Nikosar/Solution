package tests;

import simpletasks.task5.Contains;

public class Easy5 {
    public static void main(String[] args) {
        print("My house number is 156", "156");
        print("My house number is 156", "157");
        print("My house number is 156", " My");
        print("My house number is 156", "");
        print("0", "0");
        print("", " ");
        print("", "");
        print("snow is falling", "snow is falling");
    }

    public static void print(String findIn, String findThat) {
        System.out.println("\"" + findIn + "\" contains \"" + findThat + "\": " + Contains.contains(findIn, findThat));
    }
}
