public class RomanDigit {


    public static RomanDigit parse (final Character potentialRomaDigit) throws NumberFormatException {
        RomanDigit matchDigit =  basicDigits.get(Character.toUpperCase(potentialRomaDigit));
        if (matchDigit == null) {
            throw new NumberFormatException(potentialRomaDigit + " is not a valid Roman Numeral Digit");
        }
        return matchDigit;
    }

}
