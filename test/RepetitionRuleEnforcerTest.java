import org.junit.Test;

public class RepetitionRuleEnforcerTest extends RuleEnforcerTestCase {
    public RepetitionRuleEnforcerTest(){
        enforcer=new RepetitionRuleEnforcer();
    }
    @Test
    public void powerOfTensCanRepeatUptoThreeTimes()throws Exception{
        enforcer.scan(romanDigits("XXXVIII"));
        assertRuleViolationException("X cannot repeat more than thrice, this violates the Repetition Rule for Roman Numerals","XXXXVIII");
        assertRuleViolationException("I cannot repeat more than thrice, this violates the Repetition Rule for Roman Numerals","XVIIII");
    }
    @Test
    public void powersOffFiveCannotRepeat()throws Exception{
        assertRuleViolationException("V cannot repeat itself, this violates the Repetition Rule for Roman Numerals","IVV");
        assertRuleViolationException("L cannot repeat itself, this violates the Repetition Rule for Roman Numerals","XLL");
        assertRuleViolationException("D cannot repeat itself, this violates the Repetition Rule for Roman Numerals","LDD");
    }
}
