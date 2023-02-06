import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class RomanToDecimalTest {


    @Test
    public void testBasicRomanNumerals() {
        assertEquals(1, RomanToDecimal.convert("I"));
        assertEquals(5, RomanToDecimal.convert("V"));
        assertEquals(10, RomanToDecimal.convert("X"));
        assertEquals(50, RomanToDecimal.convert("L"));
        assertEquals(100, RomanToDecimal.convert("C"));
        assertEquals(500, RomanToDecimal.convert("D"));
        assertEquals(1000, RomanToDecimal.convert("M"));
    }

    @Test
    public void testSimpleCombinations() {
        assertEquals(6, RomanToDecimal.convert("VI"));
        assertEquals(14, RomanToDecimal.convert("XIV"));
        assertEquals(29, RomanToDecimal.convert("XXIX"));
        assertEquals(65, RomanToDecimal.convert("LXV"));
        assertEquals(94, RomanToDecimal.convert("XCIV"));
    }

    @Test
    public void testSubtractionRule() {
        assertEquals(4, RomanToDecimal.convert("IV"));
        assertEquals(9, RomanToDecimal.convert("IX"));
        assertEquals(40, RomanToDecimal.convert("XL"));
        assertEquals(90, RomanToDecimal.convert("XC"));
        assertEquals(400, RomanToDecimal.convert("CD"));
        assertEquals(900, RomanToDecimal.convert("CM"));
    }

    @Test
    public void testComplexCombinations() {
        assertEquals(1904, RomanToDecimal.convert("MCMIV"));
        assertEquals(1954, RomanToDecimal.convert("MCMLIV"));
        assertEquals(1990, RomanToDecimal.convert("MCMXC"));
        assertEquals(2008, RomanToDecimal.convert("MMVIII"));
    }

    @Test()
    public void testInvalidInput() {
        assertEquals(-1, RomanToDecimal.convert("ABC"));
    }
}