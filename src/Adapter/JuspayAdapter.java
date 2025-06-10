package Adapter;

public class JuspayAdapter implements iPaymentGateway{

    private Juspay juspay = new Juspay();

    @Override
    public void initiate(String OrderNumber) {
        juspay.startTransaction();
    }

    @Override
    public boolean checkStatus(String orderNumber) {
       return juspay.paymentStatus();
    }
    
}
