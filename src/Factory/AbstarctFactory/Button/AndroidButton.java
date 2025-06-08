package Factory.AbstarctFactory.Button;

public class AndroidButton implements iButton{

    @Override
    public void changeSize() {
        System.out.println("Android button size changed");
    }

    @Override
    public void changeColor() {
        System.out.println("Android button color changed");
    }
    
}
