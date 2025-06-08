package Factory.AbstarctFactory;

import Factory.AbstarctFactory.Button.AndroidButton;
import Factory.AbstarctFactory.Button.iButton;
import Factory.AbstarctFactory.Button.iOSButton;
import Factory.AbstarctFactory.Menu.iMenu;
import Factory.AbstarctFactory.Menu.iOSMenu;

public class iOSUIFactory implements UIFactory{

    @Override
    public iButton createButton() {
      System.out.println("Create iOS button");
      return new iOSButton();
    }

    @Override
    public iMenu createMenu() {
        System.out.println("Create iOS Menu");
        return new iOSMenu();
    }
    
}
