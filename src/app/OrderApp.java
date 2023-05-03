package app;

import app.product.ProductRepository;
import app.product.subproduct.Product;

import java.util.Scanner;

public class OrderApp {

    Scanner scanner = new Scanner(System.in);

    public void start(){



        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);
        Cart cart = new Cart(productRepository,menu);

        Order order = new Order(cart);
        System.out.println("🍔BurgerQeen Order Service");
        while (true) {
            menu.printMenu();
            String input = scanner.nextLine();

            if(input.equals("+")){
                //주문내역출력
                order.makeOrder();
                break;
            }
            else {
                int menuNumber = Integer.parseInt(input);

                if(menuNumber == 0) cart.printCart();
                else if (1 <= menuNumber && menuNumber <= products.length) {
                    cart.addToCart(menuNumber);
                }
            }
        }
    }
}
