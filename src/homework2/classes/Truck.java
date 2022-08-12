package homework2.classes;

import homework2.interfaces.IExtraCharge;

public class Truck extends Transport implements IExtraCharge {


    public Truck(int model, String license) {
        super(model, license);

    }


    @Override
    public void messageExtraCharge() {
        System.out.println("This will have an extra chrage of: $150");
    }

    @Override
    public double addExtraCharge() {
        return 150;
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
        System.out.println("Delivery will be sent by a Truck, model: " + this.getModel() + " " + "license: " + this.getLicense());

    }
}


