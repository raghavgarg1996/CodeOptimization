import java.util.List;

public class RepetitionRuleEnforcer implements RuleEnforcer {
    private static final int MAX_REPEAT_COUNT=3;

    public void scan(List<RomanDigit> digits){
        noFiveRepeats(digits);
        allowTensThrice(digits);
    }

    private void allowTensThrice(List<RomanDigit> digits) {
        int repeated=0;
        for(int i=1;i<digits.size();i++){
            RomanDigit previous=digits.get(i-1);
            RomanDigit current=digits.get(i);
            if(!current.equals(previous)){
                repeated=0;
                continue;
            }
            if(++repeated == MAX_REPEAT_COUNT)
                throw new NumberFormatException(current
                        +" cannot repeat more than thrice, this violates the Repetition Rule for Roman Numerals");
        }
    }
    private void noFiveRepeats(List<RomanDigit> digits) {
        for(int i=1;i<digits.size();i++){
            RomanDigit previous=digits.get(i-1);
            RomanDigit current=digits.get(i);
            if(current.equals(previous) && !current.canRepeat()){
                throw new NumberFormatException(current
                        +" cannot repeat itself, this violates the Repetition Rule for Roman Numerals");
            }
        }
    }

}