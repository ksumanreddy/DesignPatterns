package Decorator;

public class VanillaScoop implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost(){
        return iceCreamConeConstituents.getCost()+ 20;
    }

    @Override
    public String getDescription(){
        return iceCreamConeConstituents.getDescription() + "\nVanilla Scoop  20";
    }
}
