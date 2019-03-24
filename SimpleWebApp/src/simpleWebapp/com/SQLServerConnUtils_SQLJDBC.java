
package simpleWebapp.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLServerConnUtils_SQLJDBC {
 
    // Die Verbindung zum SQL Server.
    // (die Bibliothek SQLJDBC benutzen)
    public static Connection getSQLServerConnection_SQLJDBC() //
            throws ClassNotFoundException, SQLException {
 
        // Die Achtung: die Verbindungsparameter anpassen.
        String hostName = "HP";
        String sqlInstanceName = "MIKESQL";
        String database = "KRUD_NEWS";
        String userName = "sa";
        String password = "4722";
 
        return getSQLServerConnection_SQLJDBC(hostName, sqlInstanceName, database, userName, password);
    }
 
    // Zum SQL Server verbinden, SQLJDBC benutzen.
    private static Connection getSQLServerConnection_SQLJDBC(String hostName, //
            String sqlInstanceName, String database, String userName, String password)//
            throws ClassNotFoundException, SQLException {
 
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 
        // Die Struktur URL Connection für SQLServer
        // Zum Beispiel:
        // jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
        String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" //
                + ";instance=" + sqlInstanceName + ";databaseName=" + database;
 
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }
 
}