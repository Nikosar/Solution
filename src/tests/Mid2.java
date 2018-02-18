package tests;

import middletasks.task2.Encode;

public class Mid2 {
    public static void main(String[] args) {
        print("aaaabbbrrrtttyyqggg");
        print("aaaaaaaaaaaa");
        print("aabb");
        print("a");
        print("");
    }

    public static void print(String encodeThis) {
        System.out.println("\"" + encodeThis + "\" ------> \"" + Encode.encode(encodeThis) + "\"");
    }
}
