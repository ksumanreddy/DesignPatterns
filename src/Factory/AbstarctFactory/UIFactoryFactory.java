package Factory.AbstarctFactory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform platform) throws Exception{

        switch (platform) {
            case ANDROID:
                return new AndroidUIFactory();
            case IOS:
               return new iOSUIFactory();
            default:
                throw new Exception("Not supported");
        }
      }
}
