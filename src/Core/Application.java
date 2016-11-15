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
        model.connect();
        System.out.println(this.isAValidUser("cfigue", "password"));
    }

    public boolean isAValidUser(String username, String password) {
        String[] columns = {"*"};
        String[] conditions = {"username = \"" + username + "\"", "password = \"" + password + "\""};
        ResultSet result = model.select("poa", "user", columns, conditions);
        try {
            return result.first();
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
