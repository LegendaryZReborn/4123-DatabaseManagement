/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.List;
import core.Donor;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Travis Rowe
 */
public class DonorTableModel extends AbstractTableModel{
	private static final int ENV_NUM_COL = 0;
    private static final int F_NAME_COL = 1;
    private static final int L_NAME_COL = 2;
    private static final int STREET_COL = 3;
    private static final int CITY_COL = 4;
    private static final int STATE_COL = 5;
    private static final int ZIP_COL = 6;
    private static final int EMAIL_COL = 7;
    private static final int MAIL_PREF_COL = 8;
    private String[] columnNames = {"Envelope Number", "First Name", "Last Name", "Street","City","State","Zip","Email","Mail Pref"};
    private List<Donor> donors;
    
    public DonorTableModel(List<Donor> d) {
    	donors = d;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return donors.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col) {
        Donor tempDonor = donors.get(row);
        switch (col) {
            case ENV_NUM_COL:
                return tempDonor.getEnv_num();
            case F_NAME_COL:
                return tempDonor.getF_name();
            case L_NAME_COL:
                return tempDonor.getL_name();
            case STREET_COL:
                return tempDonor.getStreet();
            case CITY_COL:
                return tempDonor.getCity();
            case STATE_COL:
                return tempDonor.getState();
            case ZIP_COL:
                return tempDonor.getZip();
            case EMAIL_COL:
                return tempDonor.getEmail();
            case MAIL_PREF_COL:
                return tempDonor.getMail_pref();
            default:
                return tempDonor.getEnv_num();
        }
    }
    
    public void setValueAt(Object val, int row, int col) {
        Donor tempDonor = donors.get(row);
        switch (col) {
            case ENV_NUM_COL:
                tempDonor.setEnv_num((int) val);
            case F_NAME_COL:
                tempDonor.setF_name((String) val);
            case L_NAME_COL:
                tempDonor.setL_name((String) val);
            case STREET_COL:
                tempDonor.setStreet((String) val);
            case CITY_COL:
                tempDonor.setCity((String) val);
            case STATE_COL:
                tempDonor.setState((String) val);
            case ZIP_COL:
                tempDonor.setZip((int) val);
            case EMAIL_COL:
                tempDonor.setEmail((String) val);
            case MAIL_PREF_COL:
                tempDonor.setMail_pref((String) val);
        }
    }
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
