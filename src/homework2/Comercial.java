package homework2;

public class Comercial extends Client {


    public Comercial() {
    }

    public Comercial(String name, String adress, double phone, boolean isComercial, Product product) {
        super(name, adress, phone, isComercial, product);
    }

    public double discount() {
        double disc = 0;
        if (super.getIsComercial() == true && getProduct().getUnits() > 1000) {
            disc = (getProduct().getCost()) - (getProduct().getCost()) * 0.2;
            return disc;

        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        if (discount() > 0) {
            return super.toString() + "The final cost is: $" + this.discount() + " " + " it got a discount off: $" + (getProduct().getCost()) * 0.2;
        } else {
            return super.toString() + "The final cost is: $" + getProduct().getCost();
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
