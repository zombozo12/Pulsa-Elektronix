package PulsaElektronix;
/**
 * @author Wiguna Ramadhan
 * @kelas X - RPL 2
 * @sekolah SMKN 1 CIBINONG
 */
import java.sql.*;
import javax.swing.*;

public class MySQLConnection {
    Connection conn = null;
    
    public static Connection ConnectDb(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_epulsa","root","jancok");
            return conn;
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, "Not Connected to Databases/Turn on Your Xampp");
            return null;
        }
    
    }
}
