package Strategy;

public class PathCalculatorStrategyFactory {
    public static iPathCalculatorStrategy getStrategy(Mode mode){
        switch (mode) {
            case CAR: return new CarPathCalculator();
            case BIKE: return new BikePathCalculator();
            case BUS: return new BusPathCalculator();
            case WALK : return new WalkPathCalculator();
            default:
                return new CarPathCalculator();
        }
    }
}
