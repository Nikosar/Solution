package simpletasks.task5;

public class Contains {
    public static boolean contains(String findIn, String findThat) {
        if (findIn.length() < findThat.length()) return false;
        if (findThat.length() == 0) return true;

        char[] in = findIn.toCharArray();
        char[] that = findThat.toCharArray();

        for (int i = 0; i < in.length - that.length + 1; i++) {
            if (in[i] == that[0]) {
                int countEquals = 1;

                for (int j = 1; j < that.length; j++) {
                    i++;
                    if (in[i] == that[j]) {
                        countEquals++;
                    }
                }

                if (countEquals == that.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
