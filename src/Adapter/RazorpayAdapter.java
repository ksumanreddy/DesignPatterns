package Adapter;

public class RazorpayAdapter implements iPaymentGateway{
    
    private Razorpay razorpay = new Razorpay();

    @Override
    public void initiate(String OrderNumber) {
        razorpay.startTransaction();
        
    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return razorpay.isSuccess();
    }
    
}
