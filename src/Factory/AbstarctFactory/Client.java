package Factory.AbstarctFactory;

import Factory.AbstarctFactory.Button.iButton;
import Factory.AbstarctFactory.Menu.iMenu;

public class Client {
    public static void main(String args[]) throws Exception{
        Flutter flutter = new Flutter();
        // you want to create an iOS button 
        // Client will tell me : Create iOS button , OR create a Android button
        UIFactory uiFactory= UIFactoryFactory.createUIFactory(SupportedPlatform.IOS);
        iButton  iButton =  uiFactory.createButton();
        iButton.changeColor();
        iButton.changeSize();

        iMenu iMenu = uiFactory.createMenu();
        iMenu.createMenu();

        
    }
}
