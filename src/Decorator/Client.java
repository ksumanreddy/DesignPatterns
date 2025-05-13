package Decorator;

public class Client {
    public static void main(String args[]){


        /// first order chocolate cone , orange cone , Vanilla scoop , Strawbeery scoop 
        /// Choco chips 
        IceCreamConeConstituents iceCreamConeConstituents = new ChocolateCone();
        iceCreamConeConstituents = new OrangeCone(iceCreamConeConstituents);
        iceCreamConeConstituents = new VanillaScoop(iceCreamConeConstituents);
        iceCreamConeConstituents = new StrawbeeryScoop(iceCreamConeConstituents);
        iceCreamConeConstituents = new ChocoChips(iceCreamConeConstituents);

        System.out.println("Description : \n" + iceCreamConeConstituents.getDescription());

        System.out.println("Total cost of ice cream " + iceCreamConeConstituents.getCost());
    }
}
