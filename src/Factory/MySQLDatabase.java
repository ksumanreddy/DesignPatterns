package Factory;

public class MySQLDatabase implements Database{

    @Override
    public Query createQuery() {
        System.out.println("Returning MySQL DB");

        return new MysqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createTransaction'");
    }

    @Override
    public String getVersion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVersion'");
    }

    @Override
    public boolean isConnected() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isConnected'");
    }
    
}
