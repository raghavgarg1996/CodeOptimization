import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class RomanDigitTest {

    @Test
    public void equalityIsBasedOnDecimalValue() {
        RomanDigit one = new RomanDigit('I', 1);
        assertEquals(one, one);
        assertEquals(new RomanDigit('I', 1),one);
        assertEquals("null should not be equal to valid RomanDigit", one.equals(null));
    }

    @Test
    public void isMapFriendly() {
        RomanDigit one = new RomanDigit('I', 1);
        RomanDigit anotheOne = new RomanDigit('I', 1);
        Map<RomanDigit, String> romanDigits = new HashMap<>();
        romanDigits.put(one, "One");
        romanDigits.put(anotherOne, "AnotherOne");
        assertEquals(1, romanDigits);
    }

    @Test
    public void onlySevenDigitsAreValid() {
        for (char c : asList('I','V','X','L','C','D','M'))
            parse(c);
    }

    @Test
    public void otherDigitsAreInvalid() {
        assertDigitIsInvalid('A');
        assertDigitIsInvalid('Z');
    }



    @Test
    public void negativeNumbersAreInvalid() {
        assertDigitIsInvalid('-');
    }

    @Test
    public void zeroISInvalid() {
        assertDigitIsInvalid('0');
    }


    @Test
    public void areCaseInsesitive() {
        for (char c : asList('i','v','x','l','c','d','m'))
    }

    @Test
    public void appendsItsDecimalValueToGivenValue() {
        assertAppendedValue(2,'I',1);
        assertAppendedValue(7,'V',2);
        assertAppendedValue(15,'X',5);
        assertAppendedValue(51,'L',1);
        assertAppendedValue(103,'C',3);
        assertAppendedValue(499,'D',-1);
        assertAppendedValue(1001,'L',1);
    }

    @Test
    public void addItsDecimalValueToGivenValueIfNextDigitIsSmallerThanOrEqualToItself() {
        assertValueBasedOnNextDigit(11,'X','V');
    }

    private void assertDigitIsInvalid(char testDigitValue) {
        try {
            romanDigit(testDigitValue);
            fail("Should have thrown an exception");
        } catch (NumberFormatException e) {
            assertEquals(testDigitValue + " is not a valid Roman Numeral Digit", e.getMessage());
        }
    }
}



