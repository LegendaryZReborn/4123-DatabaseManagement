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
    
    public Login() {
        _username = "";
        _password = "";
    }
    
    public Login(String username, String password) {
        _username = username;
        _password = password;
    }
    
    public String getUsername() {
        return _username;
    }
    
    public String getPassword() {
        return _password;
    }
}
