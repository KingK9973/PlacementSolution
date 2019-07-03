
package placementsolution;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MyConnection {
    public PreparedStatement pre_s;
    public Statement stm; 
    public java.sql.Connection sql_con;
    public ResultSetMetaData rs_md;
    public ResultSet r_set;
    public MyConnection(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            sql_con=DriverManager.getConnection("jdbc:derby://localhost:1527/PlacementSolution","sa","123456");
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "CONNECTION NOT ESTABLISHED WITH DATABASE....", "ERROR", 2);
        }
    }
}