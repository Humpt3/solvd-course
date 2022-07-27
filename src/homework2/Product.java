package homework2;

public class Product {
    private int units;
    private double cost;



    public Product(){

    }

    public Product(int units, double cost){
        this.units =units;
        this.cost=cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getCost() {
        return cost;
    }

    public int getUnits() {
        return units;
    }


}
