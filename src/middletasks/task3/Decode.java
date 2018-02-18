package middletasks.task3;

public class Decode {

    public static String decode(String str) {
        StringBuilder result = new StringBuilder();
        char[] data = str.toCharArray();

        for (int i = 0; i < data.length - 1; i++) {
            int appendCount = 0;

            while (Character.isDigit(data[i])) {
                appendCount *= 10;
                appendCount += Character.digit(data[i], 10);
                i++;
            }

            for (int j = 0; j < appendCount; j++) {
                result.append(data[i]);
            }
        }
        return result.toString();
    }

}
