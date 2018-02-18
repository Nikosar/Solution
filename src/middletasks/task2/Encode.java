package middletasks.task2;

public class Encode {

    public static String encode(String str) {
        if (str.length() == 0) return "";
        char[] data = str.toCharArray();
        char lastSymbol = data[0];
        int symbolsInRow = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            if (data[i] == lastSymbol) {
                symbolsInRow++;
            } else {
                result.append(symbolsInRow);
                result.append(lastSymbol);
                symbolsInRow = 1;
                lastSymbol = data[i];
            }
        }
        result.append(symbolsInRow);
        return result.append(lastSymbol).toString();

    }
}
