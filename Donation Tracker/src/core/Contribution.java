/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
/**
 *
 * @author legen, Kevin Ellis , Tyler Coleman, Danny Tomei
 */
public class Contribution {
    private int _ID;
    private String _amt;
    private String _c_date;
    private String _note;
    private String _c_type;
    private String _fund_name;
    private int _env_num;
    
    public Contribution(){
	_ID = -1;    
	_amt = "";
	_c_date = "";
	_note = "";
	_c_type = "";
	_fund_name = "";
	_env_num = -1;
    }
    
    public Contribution(int ID, String amt, String cdate, String note, String ctype, String fundname, int envnum){
	_ID = ID;
	_amt = amt;
	_c_date = cdate;
	_note = note;
	_c_type = ctype;
	_fund_name = fundname;
	_env_num = envnum;
    }
    public int getID(){
        return _ID;
    }
    public String getAmt(){
        return _amt;
    }
    public void setAmt(String amt){
        this._amt = amt;
    }
    public String getC_date(){
        return _c_date;
    }
    public void setC_date(String cdate){
        this._c_date = cdate;
    }
    public String getNote(){
        return _note;
    }
    public void setNote(String note){
        this._note = note;
    }
    public String getC_type(){
        return _c_type;
    }
    public void setC_type(String ctype){
        this._c_type = ctype;
    }
    public String getFund_name(){
        return _fund_name;
    }
    public void setFund_name(String fundname){
        this._fund_name = fundname;
    }
    public int getEnv_num(){
        return _env_num;
    }
    public void setEnv_num(int envnum){
        this._env_num = envnum;
    }
}