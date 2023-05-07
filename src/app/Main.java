package app;

public class Main {
    public static void main(String[] args) {

        AppConfigurer appConfigurer = new AppConfigurer();

        OrderApp orderApp = new OrderApp(
                appConfigurer.productRepository(),
                appConfigurer.menu(),
                appConfigurer.cart(),
                appConfigurer.order()
        );  //흐름을 담당하는 orderapp인스턴스 실행
        orderApp.start(); //start메서드 실행
    }
}