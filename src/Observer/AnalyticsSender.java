package Observer;

public class AnalyticsSender implements OrderPlacedSubscriber{
    public AnalyticsSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced(){
        System.out.println("updating analysis ");
    }
}
