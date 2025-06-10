package Adapter;

public class CCAvenueAdapter implements iPaymentGateway{

    private CCAvenue ccAvenue = new CCAvenue();

    @Override
    public void initiate(String OrderNumber) {
        ccAvenue.beginTransaction();
        
    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return ccAvenue.getStatus();
    }
}
