package homework2;


public class Delivery {

    final private String origin = "Argentina";
    private String destination;
    private double km;
    private Client client;


    public Delivery() {

    }

    public Delivery(double km, Client client, String destination) {

        this.destination = destination;
        this.km = km;
        this.client = client;

    }


    public void setKm(double km) {
        this.km = km;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getKm() {
        return km;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Client getClient() {
        return client;
    }

    public final void finalMethod() {
        System.out.println("******DETAILS OF THE DELIVERY******");
        System.out.println(getClient().toString());
        System.out.println("Origin: " + getOrigin() + " " + "Destination: " + getDestination());
    }


}
