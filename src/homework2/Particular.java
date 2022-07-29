package homework2;

public class Particular extends Client {

    public Particular() {

    }

    public Particular(String name, String adress, double phone, boolean isComercial, Product product) {
        super(name, adress, phone, isComercial, product);
    }

    public double discount() {
        double disc = 0;
        if (super.getIsComercial() == false && getProduct().getUnits() > 1000) {
            disc = (getProduct().getCost()) - (getProduct().getCost()) * 0.1;
            return disc;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        if (discount() > 0) {
            return super.toString() + "The final cost is: $" + " " + " it got a discount off: $" + this.discount();
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

