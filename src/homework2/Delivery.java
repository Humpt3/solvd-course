package homework2;


public class Delivery {
    private double km;
    private Client client;


    public Delivery() {

    }

    public Delivery(double km, Client client) {

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

    public Client getClient() {
        return client;
    }





}
