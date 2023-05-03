package app.discount;

import app.discount.discountPolicy.DiscountPolicy;

public class FixedRateDiscountPolicy implements DiscountPolicy {
    private int discountRate; //할인비율

    public FixedRateDiscountPolicy(int discountRate) {
        this.discountRate = discountRate;
    }

    public int calculateDiscountedPrice(int price){
        return price - (price * discountRate/100);
    }
}
