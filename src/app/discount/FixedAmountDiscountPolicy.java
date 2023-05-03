package app.discount;

import app.discount.discountPolicy.DiscountPolicy;

public class FixedAmountDiscountPolicy implements DiscountPolicy {
    private int discountAmount; //할인금액

    public FixedAmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int calculateDiscountedPrice(int price){
        return price - discountAmount;
    }
}
