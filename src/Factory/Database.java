package Factory;

public interface Database {

    Query createQuery();
    Transaction createTransaction();

    String getVersion();
    boolean isConnected();
}
