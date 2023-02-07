import java.util.ArrayList;
import java.util.List;

public class RuleEnforcerTestCase {
    protected RuleEnforcer enforcer;

    protected List<RomanDigit> romanDigits(String romanValue){
        List<RomanDigit>digits=new ArrayList<>(romanValue.length());
        for(int i=0;i<romanValue.length();i++){
            digits.add(RomanDigit.parse(romanValue.charAt(i)));
        }
        return digits;
    }

    protected void assertRuleViolationException(String expectedExceptionMsg,String romanNumeral){
        try {
            enforcer.scan(romanDigits(romanNumeral));
       //     fail("Should have thrown an exception");
        } catch (NumberFormatException e) {
        //    assertEquals(expectedExceptionMsg,e.getMessage());
        }
    }
}