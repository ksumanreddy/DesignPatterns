package Factory;

public class Client {
    public static void main(String args[]){
        Service service = new Service(new MySQLDatabase());
        service.createUser();
    }
}
