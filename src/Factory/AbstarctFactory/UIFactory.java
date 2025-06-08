package Factory.AbstarctFactory;

import Factory.AbstarctFactory.Button.iButton;
import Factory.AbstarctFactory.Menu.iMenu;

/*
 * This interface has only factory methods
 */
public interface UIFactory {
    iButton createButton();
    iMenu createMenu();
}
