package app.discount.discountCondition;

import app.discount.FixedAmountDiscountPolicy;

import java.util.Scanner;

public class KidDiscountCondition {
    private boolean isSatisfied;
    private FixedAmountDiscountPolicy fixedAmountDiscountPolicy = new FixedAmountDiscountPolicy(500);

    public boolean isSatisfied() {
        return isSatisfied;
    }

    private void setSatisfied(boolean satisfied) {
        isSatisfied = satisfied;
    }

    public void checkDiscountCondition(){
        Scanner sc = new Scanner(System.in);

        System.out.println("나이가 어떻게 되십니까?");
        int input = Integer.parseInt(sc.nextLine());

        setSatisfied((input<20));
    }

    public int applyDiscount(int price){
        return  fixedAmountDiscountPolicy.calculateDiscountedPrice(price);
    }
}
