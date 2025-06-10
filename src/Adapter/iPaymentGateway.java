package Adapter;

public interface iPaymentGateway {
    
    void initiate(String OrderNumber);

    boolean checkStatus(String orderNumber);
}
