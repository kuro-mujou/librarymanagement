
package databaseClass;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

public class DatabaseConnect {
    public static Connection getDBConnect()
    {
        var server = "THEWORLD";
        var user = "sa";
        var password ="123456";
        var db = "librarymanagement";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        ds.setEncrypt(false);
        Connection conn =null;
         try {
            conn = ds.getConnection();
           
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return null;
    }
}
