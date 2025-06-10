package Strategy;

public class CarPathCalculator implements iPathCalculatorStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding path from "+ from + " to " + to + " for car");
    }
    
}
