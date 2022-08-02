package homework2;


public class Delivery {

    private Origin origin;
    private Destination destination;
    private double km;
    private Client client;

    private Transport transport;

    public Delivery() {

    }

    public Delivery(double km, Client client, Origin origin, Destination destination) {
        this.km = km;
        this.client = client;
        this.origin = origin;
        this.destination = destination;
    }


    public void setKm(double km) {
        this.km = km;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public double getKm() {
        return km;
    }


    public Origin getOrigin() {
        return origin;
    }

    public Client getClient() {
        return client;
    }

    public Transport getTransport() {
        return transport;
    }

    public Destination getDestination() {
        return destination;
    }


    public final void finalMethod() {
        System.out.println("******DETAILS OF THE DELIVERY******");
        System.out.println(getClient().clientDetails());
        System.out.println(getOrigin().originDetails() + " " + getDestination().destinationDetails());
    }


    public void finalCost() {
        double cost = getClient().getProduct().getWidth() * 10;
        if (getClient().getIsComercial() == true && getClient().getProduct().getWeight() > 1000) {
            cost = cost - cost * 0.2;
            System.out.println("The total cost its: $" + cost + " " + "It has a discount of %20");
        } else if (getClient().getIsComercial() == false && getClient().getProduct().getWeight() > 1000) {
            cost = cost - cost * 0.1;
            System.out.println("The total cost its: $" + cost + " " + "It has a discount of %10");
        } else {
            System.out.println("The total cost its: $" + cost + " " + "It has no discount");
        }
    }


    public void createTransport() {
        if (this.getKm() < 1000) {
            Car car1 = new Car(1984, "GD3SDQ");
            car1.printData();
        } else if (this.getKm() > 1000 && this.getKm() < 3000) {
            Truck truck1 = new Truck(1988, "HE3GG3");
            truck1.printData();
        } else {
            Ship ship1 = new Ship(2001, "EEE33B5");
            ship1.printData();
        }
    }


}
