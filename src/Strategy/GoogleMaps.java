package Strategy;

public class GoogleMaps {

    public void findPath(String from , String to, Mode mode){
        iPathCalculatorStrategy ipathCalculatorStrategy = PathCalculatorStrategyFactory.getStrategy(mode);

        ipathCalculatorStrategy.findPath(from , to);
    }
}
