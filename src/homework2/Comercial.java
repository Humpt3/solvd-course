package homework2;

public class Comercial extends Client {


    public Comercial(){
    }

    public Comercial(String name, String adress, double phone, boolean isComercial, Product product){
        super(name, adress, phone, isComercial, product);
      }

    public double discount(){
        double newCost = 0;
        if(super.getIsComercial()==true && getProduct().getUnits() > 1000){
            newCost = getProduct().getCost() - (getProduct().getCost() * 0.2);
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
