package Singleton;

public class Client {
    public static void main(String[] args){

    // Single threaded solution
      DBConnection db1 = DBConnection.createInstanace();
      DBConnection db2 = DBConnection.createInstanace();

      System.out.println("db1" + db1);
      System.out .println("db2 " + db2);

      DBConnection db3 = DBConnection.createInstanceMultiThreaded();
      DBConnection db4 = DBConnection.createInstanceMultiThreaded();

      System.out.println("db1" + db3);
      System.out .println("db2 " + db4);
    }
}
