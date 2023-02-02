import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private final int covertRomanToInteger;

    public RomanToInteger(int covertRomanToInteger) {
        this.covertRomanToInteger = covertRomanToInteger;
    }

    public int convertToIntger(String romanNumber) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        romanMap.put('i', 1);
        romanMap.put('v', 5);
        romanMap.put('x', 10);
        romanMap.put('l', 50);
        romanMap.put('c', 100);
        romanMap.put('d', 500);
        romanMap.put('m', 1000);

        romanNumber = romanNumber.replace(" ","");
        int lengthOfRomanNumber = romanNumber.length();
        int romanValue = romanMap.get(romanNumber.charAt(lengthOfRomanNumber - 1));
        for (int i = lengthOfRomanNumber - 2; i >= 0; i--) {
            if (romanMap.get(romanNumber.charAt(i)) >= romanMap.get(romanNumber.charAt(i + 1))) {
                romanValue += romanMap.get(romanNumber.charAt(i));
            } else {
                romanValue -= romanMap.get(romanNumber.charAt(i));
            }
        }
        return romanValue;    }
}
