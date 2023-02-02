import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void romanIisEqualTo1() {
        int covertRomanToInteger = 1;
        RomanToInteger romanToInteger = new RomanToInteger(covertRomanToInteger);
        assertEquals(covertRomanToInteger, romanToInteger.convertToIntger("I"));
    }

    @Test
    public void romaniIsEqualTo1() {
        int covertRomanToInteger = 1;
        RomanToInteger romanToInteger = new RomanToInteger(covertRomanToInteger);
        assertEquals(covertRomanToInteger, romanToInteger.convertToIntger("i"));
    }

    // Rule of Addition
    @Test
    public void whiteSpaceShouldBeIgnored() {
        int covertRomanToInteger = 110;
        RomanToInteger romanToInteger = new RomanToInteger(covertRomanToInteger);
        assertEquals(covertRomanToInteger, romanToInteger.convertToIntger("c x"));
    }

    // Rule of Repetetion
    @Test
    public void romanCCLXVIIequalsTo267() {
        int covertRomanToInteger = 267;
        RomanToInteger romanToInteger = new RomanToInteger(covertRomanToInteger);
        assertEquals(covertRomanToInteger, romanToInteger.convertToIntger("CCLXVII"));
    }

    // Rule of Subtraction
    @Test
    public void romanXCIXequalsTo99() {
        int covertRomanToInteger = 99;
        RomanToInteger romanToInteger = new RomanToInteger(covertRomanToInteger);
        assertEquals(covertRomanToInteger, romanToInteger.convertToIntger("XCIX"));
    }

    // Rule of Subtraction - Only one letter can be subtracted
    @Test
    public void romanCCMshouldGiveError() {
        int covertRomanToInteger = 0;
        RomanToInteger romanToInteger = new RomanToInteger(covertRomanToInteger);
        assertEquals(covertRomanToInteger, romanToInteger.convertToIntger("CCM"));
    }


}



