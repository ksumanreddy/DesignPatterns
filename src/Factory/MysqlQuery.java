package Factory;

public class MysqlQuery implements Query {

    @Override
    public void executeQuery() {
         System.out.println("Execute SQL query");
    }
    
}
