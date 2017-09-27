/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */


/**
 * A method.
 */
public class ReclamationProject {
    /**
     * A method.
     * @param longerString1 The integer to square.
     * @param shorterString1 The integer to square.
     * @return just return the
     */
    static String doit(final String longerString1, final String shorterString1) {
        String longerString = longerString1;
        String shorterString = shorterString1;
        if (shorterString.length() > longerString.length()) {

            String c = longerString;
            longerString = shorterString; shorterString = c;
            }
         String r = ""; // I love the ternary operator!
        /*
         * For loop with i
         */
        for (int charStart = 0; charStart < longerString.length(); charStart++) {
            for (int j = longerString.length() - charStart; j > 0; j--) {
                int end = 0;
                for (int k = 0; k < shorterString.length() - j; end++) {
                    if (longerString.regionMatches(charStart, shorterString, end, j)
                            && j > r.length()) {
                        r = longerString.substring(charStart, charStart + j); // Do it!
                    }
                        }
                } // Ah yeah
        } return r; }
}
