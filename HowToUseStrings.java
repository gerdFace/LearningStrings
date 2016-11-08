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

/*CodingBat problem --must return first and second character if they
* are 'o' or 'z', respectively.*/
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)== 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)== 'z') {
            result = result + str.charAt(1);
        }
        return result;
        }

    public String delDel(String str) {
            if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
                return str.substring(0, 1) + str.substring(4);
            }
            return str;
    }

//return String word in the middle of String out
    public String makeOutWord(String out, String word) {
        String firstPart = out.substring(0, 2);
        String lastPart = out.substring(2);
        return firstPart.concat(word).concat(lastPart);
    }
    
//return 3 copies of last two letters of str
    public String extraEnd(String str) {
        String newStr = str.substring(Math.max(str.length() - 2, 0));
        return newStr.concat(newStr).concat(newStr);
    }

/*return first two chars of a string --if less than 2 chars long return
    original string*/
    public String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        return str;
    }

/*given a string of even length return the first half*/
    public String firstHalf(String str) {
        int firstPart = str.length() / 2;
        return str.substring(0, firstPart);
    }

/*given a string return a version without the first or last characters*/
    public String withoutEnd(String str) {
        int allButLast = str.length() - 1;

        return str.substring(1, allButLast);
    }

/*given 2 strings, a and b, return short+long+short*/
    public String comboString(String a, String b) {
        int maybeShort = a.length();
        int maybeLong = b.length();

        if (maybeShort < maybeLong) {
            return a + b + a;
        }
        return b + a + b;
    }

/*concatenate 2 strings except omit the first char of each*/
    public String nonStart(String a, String b) {
        String oneNoFirstChar = a.substring(1);
        String twoNoFirstChar = b.substring(1);

        return oneNoFirstChar.concat(twoNoFirstChar);
    }

/*given a string, return a "rotated left 2" version where first two
* chars are moved to the end*/
    public String left2(String str) {
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        String noFirstTwoChars = str.substring(2);

        return noFirstTwoChars + firstChar + secondChar;
    }
/*simpler solution:
    public String left2(String str) {
      return str.substring(2) + str.substring(0, 2);
    }*/

/*given a string, return a "rotated right 2" version where last two
* chars are moved to the front*/
    public String right2(String str) {
        int lengthOfString = str.length();
        int numberWithoutLastTwo = lengthOfString - 2;
        String stringNoLastTwoChars = str.substring(0, numberWithoutLastTwo);

        return str.substring(numberWithoutLastTwo, lengthOfString) + stringNoLastTwoChars;
    }

/*given a string, return a string length 1 from the front, unless front is
* false, then return string length 1 from its back*/
    public String theEnd(String str, boolean front) {
        int lastChar = str.length();
        if (front) {
            return str.substring(0, 1);
        }
        if (!front) {
            return str.substring(lastChar -1);
        }
        return str;
    }

/*given a string, return a version without the first and last char of the
* string. the string may be length 0*/
    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() -1);
    }

/*given a string of even length, return the middle two chars. string
* length is at least 2*/
    public String middleTwo(String str) {
        int middleLeft = str.length() / 2 -1;
        int middleRight = str.length() /2 + 1;

        return str.substring(middleLeft, middleRight);
    }

/*return true if given string ends with "ly"*/
    public boolean endsLy(String str) {
        boolean endLy = str.endsWith("ly");
        return endLy;
    }

/*given a string and an int n, return a string made of the first and last n chars
* from the string. string length will be at least n*/
    public String nTwice(String str, int n) {
        int endOfString = str.length() - n;
        String firstPart = str.substring(0, n);
        String lastPart = str.substring(endOfString);

        if (endOfString >= 0) {
            return firstPart.concat(lastPart);
        }
        return str;
    }

/*given a string and an index, return a string length 2 starting at the
* given index. if the index is too big or too small to define a string
* length 2, use the first 2 chars. the string length will be at least 2*/
    public String twoChar(String str, int index) {
        int indexPlus2 = index + 2;
        double twoLessStringLength = str.length() - 2;

        if (index > 0 && index <= twoLessStringLength) {
            return str.substring(index, indexPlus2);
        }
        return str.substring(0, 2);
    }
}
