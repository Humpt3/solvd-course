package homework2;

public class Ship extends Transport {

    public Ship(int model, String license){
        super(model,license);

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
    public String toString() {
        return "homework1.Delivery will be sent by a homework1.Ship, model: "+this.getModel() +"license: "+this.getLicense();
    }
}


