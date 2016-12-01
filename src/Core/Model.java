package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Model {

    Connection link = null;

    public Connection connect() {
        String db = "poa";
        String url = "jdbc:mysql://localhost/" + db;
        String user = "root";
        String pass = "camiseta";
    

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return link;
    }

    public void close() {
        try {
            link.close();
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet select(String schema, String table, String[] columns, String[] conditions) {
        ResultSet response = null;
        String query = "SELECT ";
        for (int i = 0; i < columns.length; i++) {
            query += columns[i];
            if (i < columns.length - 1) {
                query += ", ";
            }
        }
        query += " FROM " + schema + "." + table + " ";
        if (conditions.length > 0) {
            query += " WHERE ";
        }
        for (int i = 0; i < conditions.length; i++) {
            query += conditions[i];
            if (i < conditions.length - 1) {
                query += " and ";
            }
        }
        query += ";";
        System.out.println(query);
        try {
            Statement sentence = connect().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            response = sentence.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }

    public boolean insert(String schema, String table, String[] values) {
        boolean response = false;
        String query = "INSERT INTO " + schema + "." + table + " VALUES(";
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                query += "'" + values[i] + "'";
            }else{
                query += "NULL";
            }
            if (i < values.length - 1) {
                query += ", ";
            }

        }
        query += ");";
        System.out.println(query);
        try {
            Statement sentence = connect().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            response = sentence.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }

    public ResultSet update(String schema, String table, String[] columns, String[] values, String[] conditions) {
        ResultSet response = null;
        String query = "UPDATE " + schema + "." + table + " SET ";
        for (int i = 0; i < columns.length; i++) {
            query += columns[i] + " = '" + values[i] + "'";
            if (i < columns.length - 1) {
                query += ", ";
            }
        }
        if (conditions.length > 0) {
            query += " WHERE ";
        }
        for (int i = 0; i < conditions.length; i++) {
            query += conditions[i];
            if (i < conditions.length - 1) {
                query += " and ";
            }
        }
        query += ";";
        try {
            Statement sentence = connect().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            response = sentence.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }

    public ResultSet delete(String schema, String table, String[] conditions) {
        ResultSet response = null;
        String query = "DELETE FROM " + schema + "." + table + " WHERE ";
        for (int i = 0; i < conditions.length; i++) {
            query += conditions[i];
            if (i < conditions.length - 1) {
                query += " and ";
            }
        }
        query += ";";
        try {
            Statement sentence = connect().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            response = sentence.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
}
