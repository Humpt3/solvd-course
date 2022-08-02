package homework2;

public class Main {
    public static void main(String[] args) {
        Product iphone = new Product("Iphone", 20, 30, 40, 500);
        Client jose = new Client("Jose", "Los cocos 5231", 446894, false, iphone);
        Origin argentina = new Origin(332, 543123, "Argentina");
        Destination japan = new Destination("Japan", "Tokyo", "tokyostreet 222");
        Delivery delivery1 = new Delivery(200, jose, argentina, japan);

        Product macbook = new Product("Macbook", 20, 30, 40, 1200);
        Client juan = new Client("Juan", "Los cocos 5321", 4462394, true, macbook);
        Origin argentina1 = new Origin(32, 5431233, "Argentina");
        Destination China = new Destination("China", "Shangai", "chinastreet 222");
        Delivery delivery2 = new Delivery(1200, juan, argentina, japan);


        delivery1.finalMethod();
        delivery1.finalCost();
        delivery1.createTransport();


        delivery2.finalMethod();
        delivery2.finalCost();
        delivery2.createTransport();


        System.out.println(juan.equals(jose));
        System.out.println(juan.hashCode());
        System.out.println(jose.hashCode());
    }

}
