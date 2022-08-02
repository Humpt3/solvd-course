package homework2;

public class Product {

    private String nameProduct;
    private double width;
    private double length;
    private double height;
    private double weight;

    public Product() {

    }

    public Product(String nameProduct, double width, double length, double height, double weight) {
        this.nameProduct = nameProduct;
        this.width = width;
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    //setters
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //getters
    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getWeight() {
        return weight;
    }

    /*public double costOfProduct() {
        double sup = this.getHeight() * this.getLength() * this.getWidth();
        double cost = sup * 2;
        return cost;

    }
*/
}
