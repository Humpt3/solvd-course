package homework2;

public class Client {
    private String name;
    private String adress;
    private double phone;
    private boolean isComercial;

    private Product product;


    public Client(){

    }

    public Client (String name, String adress, double phone, boolean isComercial, Product product){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.isComercial = isComercial;
        this.product=product;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public void setComercial(boolean comercial) {
        isComercial = comercial;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public double getPhone() {
        return phone;
    }

    public Product getProduct() {
        return product;
    }

    public boolean getIsComercial() {
        return isComercial;
    }


    public String toString() {
        return "homework1.Client{" +
                "name='" + this.getName() + '\'' +
                ", adress='" + this.getAdress() + '\'' +
                ", phone=" + this.getPhone() +
                ", isComercial=" + this.getIsComercial() +
                '}';
    }

}
