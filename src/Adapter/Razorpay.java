package Adapter;

public class Razorpay {
    public void startTransaction(){
        System.out.println("This is Razor Pay's class ");
    }

    public boolean isSuccess(){
        System.out.println("Call to Razor Pay is sucessful\n Payment Sucess!");
        return true;
    }
}
