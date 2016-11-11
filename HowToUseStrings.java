public class HowToUseStrings {
    public HowToUseStrings() {
    }

    public static char findCharAtIndex(String s, int x) {
        char result = s.charAt(x);
        return result;
    }

    public static boolean isTheSameText(String s, String y) {
        boolean result = s.equalsIgnoreCase(y);
        return result;
    }

    public static int returnIntIfStringsAreTheSame(String s, String y) {
        byte jibberjabber = 15;
        return isTheSameText(s, y)?jibberjabber - 5:jibberjabber;
    }

    public static String replaceAllString(String e, String n) {
        String statement = "Steve knows everything about Java!";
        return statement.replaceAll(e, n);
    }

    public static String convertToLowerCase(String u) {
        String nowLowerCase = u.toLowerCase();
        return nowLowerCase;
    }

    public String deleteBs(String s) {
        String noBs = s.replaceAll("[Bb]", "");
        return noBs;
    }

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

}
