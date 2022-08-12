package homework2.classes;

import homework2.interfaces.IExtraCharge;

public final class Ship extends Transport implements IExtraCharge {

    public Ship(int model, String license) {
        super(model, license);

    }

    @Override
    public void messageExtraCharge() {
        System.out.println("This will have an extra charge of: $500");
    }

    @Override
    public double addExtraCharge() {
        return 500;
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
        System.out.println("Delivery will be sent by a Ship, model: " + this.getModel() + " " + "license: " + this.getLicense());
    }
}


