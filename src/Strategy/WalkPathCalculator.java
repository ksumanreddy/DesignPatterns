package Strategy;

public class WalkPathCalculator  implements iPathCalculatorStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println("Finding path from "+ from + " to " + to + " by walk");
    }
    
}
