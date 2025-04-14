public class StringUtil {
    public static String concatStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        return str1 + str2;
    }
}
