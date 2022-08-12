package homework2.classes;


import homework2.exceptions.KmLimitException;

import java.util.LinkedList;

public class Delivery {

    private LinkedList<Origin> origin;
    private LinkedList<Destination> destination;
    private double km;
    private LinkedList<Client> client;

    private LinkedList<Transport> transport;
    private String stateDelivery;

    public Delivery() {

    }

    public Delivery(double km) {
        this.km = km;
        this.client = new LinkedList<>();
        this.origin = new LinkedList<>();
        this.destination = new LinkedList<>();

        try {
            Delivery.kmValidation(km);
        } catch (KmLimitException e) {
            System.out.println(e.getMessage());
        }

    }


    public void setKm(double km) {
        this.km = km;
    }


    public void setStateDelivery(String stateDelivery) {
        this.stateDelivery = stateDelivery;
    }


    public double getKm() {
        return km;
    }

    public String getStateDelivery() {
        return stateDelivery;
    }

    public LinkedList<Origin> getOrigin() {
        return origin;
    }

    public LinkedList<Client> getClient() {
        return client;
    }

    public LinkedList<Transport> getTransport() {
        return transport;
    }

    public LinkedList<Destination> getDestination() {
        return destination;
    }


    public final void finalMethod() {
        for (int i = 0; i < client.size(); i++) {
            System.out.println("******DETAILS OF THE DELIVERY******");
            System.out.println(client.get(i).clientDetails());
            System.out.println(origin.get(i).originDetails() + " " + destination.get(i).destinationDetails());

        }
    }


    public double finalCost() {
        for (int i = 0; i < client.size(); i++) {
            for (int j = 0; j < client.get(i).getProduct().size(); j++) {
                double cost = client.get(i).getProduct().get(j).getWeight() * client.get(i).getProduct().get(j).sizeOfProduct();

                if (client.get(i).getIsComercial() == true && client.get(i).getProduct().get(j).getWeight() > 1000) {
                    cost = cost - cost * 0.2;
                    System.out.println("The total cost its: $" + cost + " " + "It has a discount of %20");
                    return cost;

                } else if (client.get(i).getIsComercial() == true && client.get(i).getProduct().get(j).getWeight() > 1000) {
                    cost = cost - cost * 0.1;
                    System.out.println("The total cost its: $" + cost + " " + "It has a discount of %10");
                    return cost;

                } else {
                    System.out.println("The total cost its: $" + cost + " " + "It has no discount");
                    return cost;
                }
            }
        }
    }


    public void createTransport() {
        if (this.getKm() < 1000) {
            Car car1 = new Car(1984, "GD3SDQ");
//            this.setStateDelivery("shipped");
            car1.printData();
            double fcost = finalCost() + car1.addExtraCharge();
            car1.messageExtraCharge();
            System.out.println("Final cost its: " + fcost);

        } else if (this.getKm() > 1000 && this.getKm() < 3000) {
            Truck truck1 = new Truck(1988, "HE3GG3");
//            this.setStateDelivery("shipped");
            truck1.printData();
            double fcost = finalCost() + truck1.addExtraCharge();
            truck1.messageExtraCharge();
            System.out.println("Final cost its: " + fcost);
        } else {
            Ship ship1 = new Ship(2001, "EEE33B5");
//            this.setStateDelivery("shipped");
            ship1.printData();
            double fcost = finalCost() + ship1.addExtraCharge();
            ship1.messageExtraCharge();
            System.out.println("Final cost its: " + fcost);
        }
    }

    // Linkedlist methods

    public void showOrigins() {
        if (origin.isEmpty()) {
            System.out.println("There are no Origins");
        } else {
            for (int i = 0; i < origin.size(); i++) {
                System.out.println(origin.get(i));
            }
        }
    }

    public void showDestinations() {
        if (destination.isEmpty()) {
            System.out.println("There are no Destinations");
        } else {
            for (int i = 0; i < destination.size(); i++) {
                System.out.println(destination.get(i));
            }
        }
    }

    public void showClients() {
        if (client.isEmpty()) {
            System.out.println("There are no Clients");
        } else {
            for (int i = 0; i < client.size(); i++) {
                System.out.println(client.get(i));
            }
        }
    }

    public void showTransports() {
        if (transport.isEmpty()) {
            System.out.println("There are no Transports");
        } else {
            for (int i = 0; i < transport.size(); i++) {
                System.out.println(transport.get(i));
            }
        }
    }


    // method for exception

    public static void kmValidation(double km) throws KmLimitException {
      /*  if (delivery.getKm() > 10000) {
            throw new CustomException("allowed kilometers exceeded");
        }*/

        if (km < 1) {
            throw new KmLimitException();
        }
    }

}
