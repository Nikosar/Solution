package simpletasks.task3;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (chars[left] == ' ' || chars[left] == '.' || chars[left] == ',') {
                left++;
            }
            while (chars[right] == ' ' || chars[right] == '.' || chars[right] == ',') {
                right--;
            }
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
