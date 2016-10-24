package Core;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class Application {

    Model model = new Model();

    public void connect() {
        String[] columns = {"*"};
        String[] conditions = {"true"};

        ResultSet result = model.select("poa", "user", columns, conditions);
        try {
            while(result.next()){
                System.out.println(result.getString("username"));
                System.out.println(result.getString("password"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
