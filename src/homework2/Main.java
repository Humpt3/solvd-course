package homework2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(20, 300);
        Client client1 = new Client("Jose", "Los cocos 5231", 446894, false, product1);
        Delivery delivery1 = new Delivery(200, client1, "Bolivia");

        Product product2 = new Product(2000, 100);
        Client client2 = new Client("Microsoft", "California 222", 4678456, true, product2);
        Delivery delivery2 = new Delivery(3500, client2, "Brasil");

        Product product3 = new Product(3000, 100);
        Client client3 = new Client("Apple", "California 224", 4673456, true, product2);
        Delivery delivery3 = new Delivery(3500, client3, "Japan");

        delivery1.finalMethod();
        delivery2.finalMethod();
        delivery3.finalMethod();

        if (client1.getIsComercial() == false) {
            Particular particular1 = new Particular("Jose", "Los cocos 5231", 446894, false, product1);
            particular1.discount();
            System.out.println(particular1.toString());
        }
        if (client2.getIsComercial() == true) {
            Comercial comercial1 = new Comercial("Microsoft", "California 222", 4678456, true, product2);
            comercial1.discount();
            System.out.println(comercial1.toString());
        }


        if (delivery1.getKm() < 1000) {
            Car car1 = new Car(1984, "GD3SDQ");
            car1.printData();
        } else if (delivery1.getKm() > 1000 && delivery1.getKm() < 3000) {
            Truck truck1 = new Truck(1988, "HE3GG3");
            truck1.printData();
        } else {
            Ship ship1 = new Ship(2001, "EEE33B5");
            ship1.printData();
        }


        System.out.println(client1.equals(client2));
        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
    }

}
