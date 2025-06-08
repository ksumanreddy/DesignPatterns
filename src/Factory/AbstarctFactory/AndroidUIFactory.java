package Factory.AbstarctFactory;

import Factory.AbstarctFactory.Button.AndroidButton;
import Factory.AbstarctFactory.Button.iButton;
import Factory.AbstarctFactory.Menu.AndroidMenu;
import Factory.AbstarctFactory.Menu.iMenu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public iButton createButton() {
      System.out.println("Create Android button");
      return new AndroidButton();
    }

    @Override
    public iMenu createMenu() {
        System.out.println("Create Android Menu");
        return new AndroidMenu();
    }
    
}
