package tests;

import simpletasks.task3.Palindrome;

public class Easy3 {
    public static void main(String[] args) {
        System.out.println("\"Saippuakivikauppias\" is Palindrome: " + Palindrome.isPalindrome("Saippuakivikauppias"));
        System.out.println("\"Шалаш\" is Palindrome: " + Palindrome.isPalindrome("Шалаш"));
        System.out.println("\"Камень\" is Palindrome: " + Palindrome.isPalindrome("Камень"));
        System.out.println("\"Я\" is Palindrome: " + Palindrome.isPalindrome("Я"));
        System.out.println("\"\" is Palindrome: " + Palindrome.isPalindrome(""));
        System.out.println("\"А роза упала на лапу Азора\" is Palindrome: " + Palindrome.isPalindrome("А роза упала на лапу Азора"));

    }
}
