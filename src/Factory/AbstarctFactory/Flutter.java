package Factory.AbstarctFactory;
/**
 * To create UI for both iOs and Android
 */
public class Flutter {
    
    public void setTheme(){
        System.out.println("Theme is set. It is commom for both");
    }

    public void setRefreshRate(){
        System.out.println("Referesh rate is set. It is common for both");
    }
}
