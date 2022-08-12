package homework2.classes;

import homework2.exceptions.SizeLimitException;

import java.util.logging.Logger;

public class Main {
    private static Logger logJava = Logger.getLogger("Main");

    public static void main(String[] args) {

        //Exceptions


        Product iphone = new Product("Iphossssssssssssssssssssssssssssssssssssssssssne", 20, 30, 40, 500);
        Client jose = new Client("Jose", "Los cocos 5231", "4446894", false, iphone);
        Origin argentina = new Origin(332, 543123, "Argentina");
        Destination japan = new Destination("Japan", "Tokyo", "tokyostreet 222");
        Delivery delivery1 = new Delivery(200, jose, argentina, japan);

        Product macbook = new Product("Macbook", 20, 30, 40, 1200);
        Client juan = new Client("Juan", "Los cocos 5321", "4462394", true, macbook);
        Origin argentina1 = new Origin(32, 5431233, "Argentina");
        Destination China = new Destination("China", "Shangai", "chinastreet 222");
        Delivery delivery2 = new Delivery(1200, juan, argentina, japan);


        delivery1.finalMethod();
        try {
            Product.sizeValidation(iphone);
            delivery1.finalCost();
        } catch (SizeLimitException e) {
            System.out.println(e.getMessage());
        }

        delivery1.createTransport();

        delivery1.setStateDelivery("Shipped");

        delivery2.finalMethod();
        try {
            Product.sizeValidation(macbook);
            delivery2.finalCost();
        } catch (SizeLimitException e) {
            System.out.println(e.getMessage());
        }
        delivery2.createTransport();

        delivery2.setStateDelivery("Delivered");

        argentina.tracking(delivery1);
        argentina1.tracking(delivery2);


        System.out.println(juan.equals(jose));
        System.out.println(juan.hashCode());
        System.out.println(jose.hashCode());
    }

}
