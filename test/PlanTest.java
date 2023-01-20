import org.junit.Test;

public class PlanTest {

    private final double goldPlanBasicMonthlyRate = 49.95;
    private final double goldPlanExtraMincharge = 0.45;
    private final int goldPlanMinsIncluded = 1000;
    private final double goldAdditionalLineRate = 14.5;
    private final Plan goldPlan = new Plan(goldPlanBasicMonthlyRate, goldPlanMinsIncluded, goldPlanExtraMincharge, goldAdditionalLineRate);
    private final Context lets = new Context();


    @Test
    public void customersShouldBeChargedForMonthlyFixedAmount() {
        lets.verify(goldPlan).isCharged(goldPlanBasicMonthlyRate);
    }

    @Test
    public void customerShouldBeChargedForExtraMinsUsed() {
        lets.verify(goldPlan).withMinUsed(goldPlanMinsIncluded + 1).isCharged(goldPlanBasicMonthlyRate + goldPlanExtraMincharge);
    }

    @Test
    public void customerShouldBeChargedForAdditionalLines() {
        int additionalLines = 2;
        lets.verify(goldPlan).withAdditionalLines(additionalLines).isCharged(goldPlanBasicMonthlyRate + additionalLines *additionalLineRate);
    }
}
