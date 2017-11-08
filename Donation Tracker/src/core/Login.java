/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author cotyhamilton
 */
public class Login {
    private String _username;
    private String _password;
    private String _address;
    private String _database;
    
    public Login() {
        _username = "";
        _password = "";
        _address = "";
        _database = "";
    }
    
    public Login(String username, String password, String address, String database) {
        _username = username;
        _password = password;
        _address = address;
        _database = database;
    }
    
    public String getUsername() {
        return _username;
    }
    
    public String getPassword() {
        return _password;
    }
    
    public String getAddress() {
        return _address;
    }
    
    public String getDatabase() {
        return _database;
    }
}
