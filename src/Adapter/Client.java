package Adapter;

import java.util.List;

public class Client {
    public static void main(String args[]){
        Udemy udemy = new Udemy(List.of(new RazorpayAdapter())); // Razor pay ,  if I change this to use CCAvenueAdapter then it will use CCAvenue gateway
        udemy.payment();
    }
}
