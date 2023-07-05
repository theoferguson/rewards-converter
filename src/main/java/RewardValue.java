public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = miles * CONVERSION_RATE;
    }

    // Method that returns the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method that returns how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }
}
