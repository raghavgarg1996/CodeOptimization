import static java.lang.Math.*;

public class Plan {
    private final double basicMonthlyRate;
    private final int minsIncluded;
    private final double extraMincharge;
    private final double additionalLineRate;


    public Plan(double basicMonthlyRate, int minsIncluded, double extraMincharge, double additionalLineRate) {

        this.basicMonthlyRate = basicMonthlyRate;
        this.minsIncluded = minsIncluded;
        this.extraMincharge = extraMincharge;
        this.additionalLineRate = additionalLineRate;
    }

    public double calculateBill(int minsUsed) {
        return basicMonthlyRate + chargeForExtraMins(minsUsed);
    }

    private double chargeForExtraMins(int minsUsed) {
        int extraMins = max(minsUsed - minsIncluded, 0);
        return extraMins * extraMincharge;
    }
}
