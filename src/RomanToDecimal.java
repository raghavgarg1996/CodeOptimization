
import java.util.HashMap;

public class RomanToDecimal {



    private static HashMap<Character, Integer> romanValues;

    static {
        romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }
    public static boolean isValidRomanNumeral(String romanNumeral) {
        if (romanNumeral == null || romanNumeral.length() == 0) {
            return false;
        }

        int previousValue = 0;
        int currentValue;
        int total = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char c = romanNumeral.charAt(i);
            if (!romanValues.containsKey(c)) {
                return false;
            }
            currentValue = romanValues.get(c);
            if (currentValue < previousValue) {
                total -= currentValue;
            } else {
                total += currentValue;
                previousValue = currentValue;
            }
        }

        return true;
    }

    public static int convert(String roman) {
        if ( !isValidRomanNumeral( roman ) ) {
            System.out.println( roman + " is not a valid Roman numeral." );
            return -1;
        }
        int decimal = 0;
        int lastValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(roman.charAt(i));
            if (currentValue < lastValue) {
                decimal -= currentValue;
            } else {
                decimal += currentValue;
            }
            lastValue = currentValue;
        }
        return decimal;
    }
}