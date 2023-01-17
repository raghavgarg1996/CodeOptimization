import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlanTest {

    private final double goldPanBasicMonthlyRate = 49.95;
    private final double goldPlanExtraMincharge = 0.45;
    private final int goldPlanMinsIncluded = 1000;
    private final Plan goldPlan = new Plan(goldPanBasicMonthlyRate, goldPlanMinsIncluded, goldPlanExtraMincharge);
    private final double goldPlanBasicMonthlyRate = 49.95;

    @Test
    public void customersShouldBeChargedForMonthlyFixedAmount() {
        Plan plan = new Plan(goldPlanBasicMonthlyRate, 1000, 0.45);
        assertEquals(goldPlanBasicMonthlyRate, plan.calculateBill(0));
    }

    @Test
    public void customerShouldBeChargedForExtraMinsUsed() {
        assertEquals(goldPanBasicMonthlyRate + goldPlanExtraMincharge, goldPlan.calculateBill(goldPlanMinsIncluded +1));
    }
}
