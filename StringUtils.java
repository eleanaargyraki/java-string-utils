package gr.aueb.cf.ch14;

/**
 * This is a utility class containing three public static methods
 * for String manipulation. The first method reverses a given string,
 * The second method converts a string to uppercase. The third method
 * checks if a string is palindromic and returns true/false.
 */
public final class StringUtils {

    private StringUtils() {}

    /**
     * This method reverses a string.
     * @param s the string to be reversed.
     * @return the reversed string.
     */
    public static String stringReverse (String s) {
        StringBuilder sb = new StringBuilder();
        String[] array = s.split("");
        String[] helperArray = new String[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            helperArray[i] = array[j];
        }

        for (int i = 0; i < helperArray.length; i++) {
            sb.append(helperArray[i]);
        }

        return sb.toString();
    }

    /**
     * Converts a string to uppercase.
     * @param s the string to be converted.
     * @return the string in uppercase.
     */
    public static String toUpperCase (String s) {
        return s.toUpperCase();
    }

    /**
     * Checks if a string is palindromic and returns true if it is
     * and false if it's not.
     * @param s the string to be checked.
     * @return true/false.
     */
    public static boolean isPalindromic (String s) {
        String[] array = s.split("");

        for (int i = 0, j = array.length-1; i < j; i++, j--) {
            if (!array[i].equals(array[j])) {
                return false;
            }
        }

        return true;
    }
}
