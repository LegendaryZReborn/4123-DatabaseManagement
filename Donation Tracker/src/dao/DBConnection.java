package dao;

import java.sql.*;

public class DBConnection {
    private Connection conn;
    private String username;
    private String password;
    private String dbURL;

    public DBConnection(String user, String pass, String address, String Database) {
        username = user;
        password = pass;
        dbURL = "jdbc:mysql://" + address + "/" + Database;
    }

    public void Open() throws Exception {
        conn = DriverManager.getConnection(dbURL, username, password);
        System.out.println("Opened DB Connection");
    }

    public void Close() throws Exception {
        if (conn != null) {
            conn.close();
            System.out.println("Closed DB Connection");
        }
    }

    Statement createStatement() throws Exception {
        return conn.createStatement();
    }

    PreparedStatement prepareStatement(String sql) throws Exception {
        return conn.prepareStatement(sql);
    }

    void close(Statement stmt, ResultSet rs) throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
    }
}
