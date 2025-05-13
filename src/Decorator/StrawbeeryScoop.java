package Decorator;

public class StrawbeeryScoop implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public StrawbeeryScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost(){
        return iceCreamConeConstituents.getCost()+ 20;
    }

    @Override
    public String getDescription(){
        return iceCreamConeConstituents.getDescription() + "\nStrawbeery Scoop  20";
    }
}
