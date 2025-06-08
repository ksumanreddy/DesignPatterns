package Factory.AbstarctFactory.Button;

public class iOSButton implements iButton {

    @Override
    public void changeSize() {
       System.out.println("iOS button size changed");
    }

    @Override
    public void changeColor() {
        System.out.println("iOS button color changed");
    }
    
}
