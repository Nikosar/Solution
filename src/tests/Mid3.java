package tests;

import middletasks.task2.Encode;
import middletasks.task3.Decode;

public class Mid3 {
    public static void main(String[] args) {
        print("4a3b3r3t2y1q3g");
        print("100a");
        print("1e");
        print("");
        System.out.println("\"aaaabbbgttjklllff\" after encode and decode = " +
                Decode.decode(Encode.encode("aaaabbbgttjklllff")));

    }

    public static void print(String decodeThis) {
        System.out.println("\"" + decodeThis + "\" ------> \"" + Decode.decode(decodeThis) + "\"");
    }
}
