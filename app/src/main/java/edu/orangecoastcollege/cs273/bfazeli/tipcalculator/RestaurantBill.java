package edu.orangecoastcollege.cs273.bfazeli.tipcalculator;

/**
 * Created by bijanfazeli on 9/8/16.
 */
public class RestaurantBill {

    private double mAmount;
    private double mTipPercent;
    private double mTaxPercent = .08;
    private double mTipAmount;
    private double mTotalAmount;

    public RestaurantBill() {
        mAmount = 0.0;
        mTipPercent = 0.0;
        mTipPercent = 0.0;
        mTotalAmount = 0.0;
    }

    public RestaurantBill(double amount, double tipPercent) {
        mAmount = amount;
        mTipPercent = tipPercent;
        recalculateAmounts();
    }

    public double getAmount() {
        return mAmount;
    }

    public double getTipPercent() {
        return mTipPercent;
    }

    public double getTipAmount() {
        return mTipAmount;
    }

    public double getTotalAmount() {
        return mTotalAmount;
    }

    public void setTipPercent(double tipPercent) {
        mTipPercent = tipPercent;
        recalculateAmounts();
    }

    public void setAmount(double amount) {
        mAmount = amount;
        recalculateAmounts();
    }

    private void recalculateAmounts() {
        mTipAmount = mAmount * mTipPercent;
        mTotalAmount = mAmount + mTipAmount;
    }
}
