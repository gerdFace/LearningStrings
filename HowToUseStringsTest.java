import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HowToUseStringsTest {
    public HowToUseStringsTest() {
    }

    @Test
    public void testFindCharAtIndex() {
        String s = "Hi there Steve!";
        byte x = 9;
        char actual = HowToUseStrings.findCharAtIndex(s, x);
        char expected = 83;
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsIgnoreCase() {
        String s = "Hello My Name Is Steven.";
        String y = "hello my name is steven.";
        boolean expected = HowToUseStrings.isTheSameText(s, y);
        assertTrue("These texts don't match.", expected);
    }

    @Test
    public void testReturnIntIfStringsAreTheSame() {
        String s = "Hello there.";
        String y = "hEllO ThEre.";
        int actual = HowToUseStrings.returnIntIfStringsAreTheSame(s, y);
        byte expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceAllString() {
        String e = "everything";
        String n = "NOTHING";
        String actual = HowToUseStrings.replaceAllString(e, n);
        String expected = "Steve knows NOTHING about Java!";
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertToLowerCase() {
        String u = "THESE should ALL be SMall!";
        String actual = HowToUseStrings.convertToLowerCase(u);
        String expected = "these should all be small!";
        assertEquals(expected, actual);
    }

    @Test
    public void testDeleteBs() {
        HowToUseStrings usingStrings = new HowToUseStrings();
        String alphabetSoup = "ABBbCcddDeFBb";
        String actual = usingStrings.deleteBs(alphabetSoup);
        String expected = "ACcddDeF";
        assertEquals(expected, actual);
    }

    @Test
    public void testDelDel() {
        HowToUseStrings usingStrings = new HowToUseStrings();
        String testDel = "adelbc";
        String actual = usingStrings.delDel(testDel);
        String expected = "abc";
        assertEquals(expected, actual);
    }
}