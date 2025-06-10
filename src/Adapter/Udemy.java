package Adapter;

import java.util.List;

public class Udemy {
    private List<iPaymentGateway> paymentGateway;

    public Udemy(List<iPaymentGateway> paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    void payment(){
        paymentGateway.get(0).initiate("1234");
        paymentGateway.get(0).checkStatus(null);
    }
}
