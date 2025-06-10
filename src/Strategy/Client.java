package Strategy;

public class Client {
    public static void main(String args[]){
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Kolar","Bangalore",Mode.BUS);
    }
}
