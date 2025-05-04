package Singleton;

public class DBConnection {
   
    private static DBConnection INSTANCE = null;
    private String name;
    private String password;
    private Integer port;
    private String url;
    
    private DBConnection(){

    }

    public static DBConnection createInstanace(){
       if(INSTANCE==null){
         return INSTANCE = new DBConnection();
      }

      return INSTANCE;
    }

    public static DBConnection createInstanceMultiThreaded(){
        if(INSTANCE==null){
            synchronized(DBConnection.class){
                if(INSTANCE==null){
                    return INSTANCE = new DBConnection();
                }
            }
        }
        return INSTANCE;
    }
}
