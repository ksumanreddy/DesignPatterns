package Decorator;

public class OrangeCone implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    // Orhange Cone can exist independently , meaning Only orange cone 
    // can be added , So have default construct
    public OrangeCone(){}


    // I can have an instance where I have Choclate cone and 
    // Orange Cone , I need to use another constructor with 
    //choclate cone , SO use dependcy injection
    public OrangeCone(IceCreamConeConstituents iceCreamConeConstituents){
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
            return iceCreamConeConstituents.getDescription() + "\nOrange Cone  20";
        }

        return "Orange cone  20";
    } 
}
