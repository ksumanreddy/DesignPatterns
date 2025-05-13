package Decorator;

public class ChocolateCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

    public ChocolateCone(){}

    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost(){
        if(iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getCost() + 20;
        }

        return 20;
    }

    @Override
    public String getDescription(){
        if(iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getDescription() + "\nChocolate Cone  20";
        }

        return "Chocolate cone  20";
    }
}
