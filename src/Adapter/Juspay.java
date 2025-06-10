package Adapter;

public class Juspay {

    public void startTransaction(){
        System.out.println("This is Juspay's Payment gateway class ");
    }

    public boolean paymentStatus(){
        System.out.println("Call to Juspay's Payment gateway is sucessfull\n Payment Sucess!");
        return true;
    }
}
