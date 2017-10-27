/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
/**
 *
 * @author legen, Max Duhan
 */
public class Donor {
    private int _env_num;
    private String _f_name;
    private String _l_name;
    private String _street;
    private String _city;
    private String _state;
    private String _zip;
    private String _email;
    private String _mail_pref;
    
    public Donor(){
        _env_num = "";
        _f_name = "";
        _l_name = "";
        _street = "";
        _city = "";
        _state = "";
        _zip = "";
        _email = "";
        _mail_pref = "";
    }
    
    public Donor(int eNum, String fname, String lname, String street, String city, String state, String zip, String email, String mpref){
        _env_num = eNum;
        _f_name = fname;
        _l_name = lname;
        _street = street;
        _city = city;
        _state = state;
        _zip = zip;
        _email = email;
        _mail_pref = mpref;
    }
    public int getEnv_num(){
        return _env_num;
    }
    public void setEnv_num(int eNum){
        this._env_num = eNum;
    }
    public String getF_name(){
        return _f_name;
    }
    public void setF_name(String fname){
        this._f_name = fname;
    }
    public String getL_name(){
        return _l_name;
    }
    public void setL_name(String lname){
        this._l_name = lname;
    }
    public double getStreet(){
        return _street;
    }
    public void setStreet(String street){
        this._street = street;
    }
    public double getCity(){
        return _city;
    }
    public void setCity(String city){
        this._city = city;
    }
    public double getState(){
        return _state;
    }
    public void setState(String state){
        this._state = state;
    }
    public double getZip(){
        return _zip;
    }
    public void setZip(String zip){
        this._zip = zip;
    }
    public double getEmail(){
        return _email;
    }
    public void setEmail(String email){
        this._email = eMail;
    }
    public double getMail_pref(){
        return _mail_pref;
    }
    public void setMail_pref(String email){
        this._mail_pref = mpref;
    }
}
