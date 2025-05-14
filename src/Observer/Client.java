package Observer;

public class Client {
    public static void main(String[] args){
        Flipkart flipkart = Flipkart.getInstance();
        EmailSender email = new EmailSender();
        InvoiceGenerator invoice = new InvoiceGenerator();
        AnalyticsSender analysis = new AnalyticsSender();
        flipkart.orderPlaced();
    }
}
