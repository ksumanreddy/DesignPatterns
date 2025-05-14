package Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    public static Flipkart getInstance(){
        if(instance==null){
            return instance = new Flipkart();
        }

        return instance;
    }

    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubsriber){
        orderPlacedSubscribers.add(orderPlacedSubsriber);
    }

    void unRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubsriber){
        orderPlacedSubscribers.add(orderPlacedSubsriber);
    }

    public void orderPlaced(){
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
