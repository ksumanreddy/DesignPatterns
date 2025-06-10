package Strategy;

public class BusPathCalculator implements iPathCalculatorStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding path from "+ from + " to " + to + " for bus");
    }
    
}
