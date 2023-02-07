import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;



public class RomanDigitTest {
    @Test
    public void equalityIsBasedOnDecimalValue(){
        RomanDigit one=new RomanDigit('I',1);
        assertEquals(one,one);
        assertEquals(new RomanDigit('I',1),one);
        assertFalse("null should not be equal to valid RomanDigit",one.equals(null));
    }
    @Test
    public void isMapFriendly(){
        RomanDigit one=new RomanDigit('I',1);
        RomanDigit anotherOne=new RomanDigit('I',1);
        Map<RomanDigit,String>romanDigit=new HashMap<>();
        romanDigit.put(one,"One");
        romanDigit.put(anotherOne,"AnotherOne");
        assertEquals(1,romanDigit.size());
        assertEquals("AnotherOne",romanDigit.get(one));
        assertEquals("AnotherOne",romanDigit.get(anotherOne));
    }
    @Test
    public void onlySevenDigitsAreValid(){
        for(char c:asList('I','V','L','X','C','D','M'))
            RomanDigit.parse(c);
    }
    @Test
    public void otherDigitsAreInvalid(){
        assertDigitsIsInvalid('A');
        assertDigitsIsInvalid('Z');
    }

    @Test
    public void negativeNumbersAreInvalid(){
        assertDigitsIsInvalid('-');
    }
    @Test
    public void zeroIsInvalid(){
        assertDigitsIsInvalid('0');
    }
    @Test
    public void areCaseInsensitive(){
        for(char c:asList('i','v','x','l','c','d','m'))
            RomanDigit.parse(c);
        assertDigitsIsInvalid('a');
        assertDigitsIsInvalid('z');
    }
    @Test
    public void appendsItsDecimalValueToGivenValue(){
        assertAppendedValue(2,'I',1);
        assertAppendedValue(7,'V',2);
        assertAppendedValue(15,'X',5);
        assertAppendedValue(51,'L',1);
        assertAppendedValue(103,'C',3);
        assertAppendedValue(499,'D',-1);
        assertAppendedValue(1001,'M',1);
    }
    @Test
    public void addItsDecimalValueToGivenValueIfNextDigitIsSmallerThanOrEqualToItself(){
        assertValueBasedOnNextDigit(2,'I','I');
        assertValueBasedOnNextDigit(6,'V','I');
        assertValueBasedOnNextDigit(11,'X','I');
        assertValueBasedOnNextDigit(11,'X','V');
    }
    @Test
    public void subtractsItsDecimalValueFromGivenValueIfNextDigitIsGreaterThanItself(){
        assertValueBasedOnNextDigit(0,'I','V');
        assertValueBasedOnNextDigit(-4,'V','X');
        assertValueBasedOnNextDigit(-9,'X','L');
    }
    @Test
    public void onlyPowerOfTensRepeat(){
        assertTrue("I is a power of Ten and can repeat",romanDigit('I').canRepeat());
        assertFalse("V is not a power of Ten and should not repeat",romanDigit('V').canRepeat());
        assertTrue("X is a power of Ten and can repeat",romanDigit('X').canRepeat());
        assertFalse("V is not a power of Ten and should not repeat",romanDigit('L').canRepeat());
    }

    private void assertDigitsIsInvalid(final char testDigitValue) {
        try {
            romanDigit(testDigitValue);
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertEquals(testDigitValue+" is not a valid Roman Numeral Digit",e.getMessage());
        }

    }

    private RomanDigit romanDigit(final char testDigit) {
        return RomanDigit.parse(testDigit);
    }

    private void assertAppendedValue(final int expected,final char digit,final int oldValue) {
        assertEquals(expected,romanDigit(digit).appendValueTo(oldValue));
    }

    private void assertValueBasedOnNextDigit(final int expected,final char digit,final char next) {
        assertEquals(expected,romanDigit(digit).dependingOnNextDigitAppendValueTo(1,romanDigit(next)));
    }

    private void assertDigitIsInvalid(final char testDigitValue) {
        try {
            romanDigit(testDigitValue);
            Assertions.fail("Should have thrown an exception");
        } catch (NumberFormatException e) {
            assertEquals(testDigitValue + " is not a valid Roman Numeral Digit", e.getMessage());
        }
    }
}