package app;

import app.product.subproduct.Drink;
import app.product.subproduct.Hamburger;
import app.product.subproduct.Product;
import app.product.subproduct.Side;

public class Menu {
    private Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }

    public void printMenu(){
        System.out.println("[🔻] 메뉴");
        System.out.println("-".repeat(60));

        printHamburgers(true);

        printSides(true);

        printDrinks(true);

        System.out.println();
        System.out.println("🧺 (0) 장바구니");
        System.out.println("📌 (+) 주문하기");
        System.out.println("-".repeat(60));
        System.out.println("[📣] 메뉴를 선택해주세요 : ");
    }

    protected void printDrinks(boolean printPrice) {
        System.out.println("🥤 음료");
        //여기에서 음료 출력
        for(Product product : products) {
            if (product instanceof Drink) {
                printEachMenu(product, printPrice);
            }
        }

        System.out.println();
    }

    protected void printSides(boolean printPrice) {
        System.out.println("🍟 사이드");
        //여기에서 사이드 출력
        for(Product product : products) {
            if (product instanceof Side) {
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    protected void printHamburgers(boolean printPrice) {
        System.out.println("🍔 햄버거");
        //여기에서 햄버거 출력
        for(Product product : products){
            if(product instanceof Hamburger){
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private static void printEachMenu(Product product, boolean printPrice) {
        if(printPrice) System.out.printf(
                "(%d) %s %5dKal %5d원\n", product.getId(), product.getName(), product.getKcal(), product.getPrice());
        else System.out.printf("(%d) %s %5dKal\n", product.getId(), product.getName(), product.getKcal());
    }
}
