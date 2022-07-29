package homework2;

public class Car extends Transport {

    public Car(int model, String license) {
        super(model, license);

    }


    /* public double calculateCost(){
                        double tcost=0;
                        if(this.getKm() <= 1000){
                            tcost = getProduct().getCost() + 200;
                        }
                        return tcost;

                    }
                */
    @Override
    public void printData() {
        System.out.println("Delivery will be sent by a car, model: " + this.getModel() + " " + "license: " + this.getLicense());
    }
}

