import java.util.HashMap;
import java.util.Map;

public class RomanDigit {
    private final int decimalValue;
    private final Character symbol;

    private static final Map<Character,RomanDigit> basicDigits=new HashMap<>(){
        {
            put('I', new RomanDigit('I', 1));
            put('V', new RomanDigit('V', 5));
            put('X', new RomanDigit('X', 10));
            put('L', new RomanDigit('L', 50));
            put('C', new RomanDigit('C', 100));
            put('D', new RomanDigit('D', 500));
            put('M', new RomanDigit('M', 1000));
        }
    };

    public RomanDigit(final Character value, final int decimalValue){
        this.decimalValue=decimalValue;
        symbol=value;
    }

    public static RomanDigit parse(final Character potentialRomanDigit) {
        RomanDigit matchingDigit=basicDigits.get(Character.toUpperCase(potentialRomanDigit));
        if(matchingDigit==null){
            throw new NumberFormatException(potentialRomanDigit + " is not a valid Roman Numeral Digit");
        }
        return matchingDigit;
    }


    public boolean canRepeat(){
        return isPowerOfTen();
    }
    @Override
    public boolean equals(final Object other){
        if(this==other){
            return true;
        }
        if(other==null) {
            return false;
        }
        if(!this.getClass().equals(other.getClass())){
            return false;
        }
        return equals((RomanDigit) other);
    }

    @Override
    public int hashCode(){
        int hashCode=17;
        hashCode+=13*symbol.hashCode();
        return hashCode+29*decimalValue;
    }

    public boolean isGreaterThan(final RomanDigit other) {
        return decimalValue>other.decimalValue;
    }

    public boolean isPowerOfTen() {
        return recursivelyDivideBy10(decimalValue)==1;
    }

    private int recursivelyDivideBy10(final int value) {
        if(value<=1){
            return value;
        }
        return recursivelyDivideBy10(value/10);
    }

    public boolean isOneTenth(final RomanDigit other) {
        return isOneNthOf(10,other);
    }

    public boolean isOneFifth(final RomanDigit other) {
        return isOneNthOf(5,other);
    }

    private boolean isOneNthOf(final int n, final RomanDigit other) {
        return decimalValue*n == other.decimalValue;
    }

    @Override
    public String toString(){
        return String.valueOf(symbol);
    }

    public int appendValueTo(final int totalValue){
        return totalValue+decimalValue;
    }

    public int dependingOnNextDigitAppendValueTo(final int totalValue, final RomanDigit nextDigit) {
        if(nextDigit.isGreaterThan(this)){
            return totalValue-decimalValue;
        }
        return totalValue+decimalValue;
    }

    private boolean equals(final RomanDigit other){
        return symbol.equals(other.symbol)&& decimalValue==other.decimalValue;
    }
}