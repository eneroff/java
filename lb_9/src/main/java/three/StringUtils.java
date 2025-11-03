package three;

public class StringUtils {
    public static String getMiddleTwo(String input) {
        int mid = input.length() / 2;
        return input.substring(mid - 1, mid + 1);
    }
}