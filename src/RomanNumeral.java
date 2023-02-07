import java.util.List;

public class RomanNumeral extends Number{
    private final List<RomanDigit>digits;
    RomanNumeral(List<RomanDigit> romanDigits){
        this.digits=romanDigits;
    }


    @Override
    public String toString(){
        StringBuilder outputString=new StringBuilder();
        for(RomanDigit digit:digits){
            outputString.append(digit.toString());
        }
        return outputString.toString();
    }
    @Override
    public int intValue() {
        return decimalValue();
    }

    @Override
    public long longValue() {
        return decimalValue();
    }

    @Override
    public float floatValue() {
        return decimalValue();
    }

    @Override
    public double doubleValue() {
        return decimalValue();
    }

    public int decimalValue() {
        int total=0;
        int lastIndex=digits.size()-1;
        for(int i=0;i<lastIndex;++i){
            RomanDigit current=digits.get(i);
            RomanDigit next=digits.get(i+1);
            total=current.dependingOnNextDigitAppendValueTo(total,next);
        }
        RomanDigit last=digits.get(lastIndex);
        return last.appendValueTo(total);
    }

    public static RomanNumeral parse(String romanDigits){
        return new RomanNumeralParser().compose(romanDigits);
    }
}