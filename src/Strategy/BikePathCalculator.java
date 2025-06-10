package Strategy;

public class BikePathCalculator implements iPathCalculatorStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding path from "+ from + " to " + to + " for bike");
    }
    
}
