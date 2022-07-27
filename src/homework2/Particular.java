package homework2;

public class Particular extends Client {

    public Particular(){

    }

    public Particular(String name, String adress, double phone, boolean isComercial, Product product){
        super(name, adress, phone, isComercial, product);
    }

    public double discount(){
        double newCost = 0;
        if(super.getIsComercial() == false && getProduct().getUnits() > 1000){
            newCost = getProduct().getCost() - (getProduct().getCost() * 0.1);
        }
        return newCost;
    }

    @Override
    public String toString() {
        return super.toString() + " it got a discount off: $" + this.discount();
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

