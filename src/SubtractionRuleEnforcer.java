import java.util.List;
import java.util.stream.IntStream;


public class SubtractionRuleEnforcer implements RuleEnforcer {

    public void scan(List<RomanDigit> digits){
        IntStream.range(1,digits.size()).forEach(i->{
            RomanDigit current=digits.get(i);
            RomanDigit previous=digits.get(i-1);
            if(!current.isGreaterThan(previous)) return;
            tensCanPrecedeHigherValueDigit(previous,current);
            precedingDigitIsTenOrFiveTimesFollowingHigherValueDigit(previous,current);
            precedingDigitIsGreaterThanDigitFollowingHigherValueDigit(digits,previous,current,i);
            canSubstractFromHighValueDigitOnlyOnce(digits,previous,current,i);
        });
    }

    private void canSubstractFromHighValueDigitOnlyOnce(List<RomanDigit> digits, RomanDigit previous, RomanDigit current, int index) {
        if(index <=1) return;
        RomanDigit twoBehind=digits.get(index-2);
        if(twoBehind.equals(previous))
            throw new NumberFormatException(previous+""+twoBehind+" cannot be subtracted from "+current
                    +", this violates the Subtraction Rule for Roman Numerals");
        if(current.isGreaterThan(twoBehind))
            throw new NumberFormatException(twoBehind+" cannot be subtracted from "+previous+", since "+twoBehind+"is" +
                    "smaller than"+current+", this violates the Subtraction Rule for Roman Numerals");
    }

    private void precedingDigitIsGreaterThanDigitFollowingHigherValueDigit(List<RomanDigit> digits, RomanDigit previous, RomanDigit current, int index) {
        if(index>= digits.size()-1) return;
        RomanDigit nextDigit = digits.get(index+1);
        if(!previous.isGreaterThan(nextDigit))
            throw new NumberFormatException(previous+" cannot be subtracted from "+ current +", since "+ previous
                    +" is smaller than or equal to "+ nextDigit+". This violates the Subtraction Rule for Roman Numerals");
    }

    private void precedingDigitIsTenOrFiveTimesFollowingHigherValueDigit(RomanDigit previous, RomanDigit current) {
        if(!(previous.isOneTenth(current) || previous.isOneFifth(current)))
            throw new NumberFormatException(previous+ " cannot be subtracted from "+current+", since "+previous
                    +" is not one tenth or one fifth of "+current+". This violates the Subtraction Rule for Roman Numerals");
    }

    private void tensCanPrecedeHigherValueDigit(RomanDigit previous, RomanDigit current) {
        if(!previous.isPowerOfTen())
            throw new NumberFormatException(previous +" cannot be subtracted from "+current+ ", since "+ previous
                    + " is not a power of ten. This violates the Subtraction Rule for Roman Numerals");
    }
}