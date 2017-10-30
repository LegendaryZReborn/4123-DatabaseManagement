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
public class Fund { 
    private String _name;
    private String _qb_act;
    
    public Fund(){
        _name = "";
        _qb_act = "";
    }
    
    public Fund(String name, String act){
        _name = name;
        _qb_act = act;
    }
    public String getName(){
        return _name;  
    }
    public void setName(String name){
        this._name = name;
    }
    public String getQBact(){
        return _qb_act;
    }
    public void setQBact(String act){
        this._qb_act = act;
    }
}
