import static junit.framework.TestCase.assertEquals;

public class Context {
    private Plan goldPlan;
    private int minUsed;
    private int additionalLines;

    public Context verify(CardsTest goldPlan) {
        this.goldPlan = goldPlan;
        return this;
    }

    public Context withMinUsed(int minUsed) {
        this.minUsed = minUsed;
        return this;
    }

    public void isCharged(double expectedBillAmount) {
        assertEquals(expectedBillAmount, goldPlan.calculateBill(minUsed, additionalLines));
    }

    public Context withAdditionalLines(int additionalLines) {
        this.additionalLines = additionalLines;
        return this;
    }


}
