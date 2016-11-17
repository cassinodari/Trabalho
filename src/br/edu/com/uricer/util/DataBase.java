package br.edu.com.uricer.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cassi
 */
public class DataBase {

    public static Connection getConnection() {         
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:C:/BD/BD_BORDERO.FDB", "SYSDBA", "masterkey");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    } 
}
