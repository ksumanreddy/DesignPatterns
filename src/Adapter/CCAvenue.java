package Adapter;

public class CCAvenue {

    public void beginTransaction(){
        System.out.println("This is CCAvenue's Payment gateway class ");
    }

    public boolean getStatus(){
        System.out.println("Call to CCAvenue's Payment gateway is sucessfull\n Payment Sucess!");
        return true;
    }

}
