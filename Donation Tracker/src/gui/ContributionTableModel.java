/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.List;
import java.sql.Date;
import core.Contribution;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Tyler Coleman, Kevin Ellis, Daniel Tomei
 */
public class ContributionTableModel extends AbstractTableModel {

    private static final int ID_COL = 0;
	private static final int C_DATE_COL = 1;
	private static final int ENV_NUM_COL = 2;
    private static final int AMT_COL = 3;
	private static final int FUND_NAME_COL = 4;
	private static final int C_TYPE_COL = 5;
    private static final int NOTE_COL = 6;
    private String[] columnNames = {"ID", "Date", "Envelope Number", "Amount","Fund","Type","Note"};
    private List<Contribution> contributions;

    public ContributionTableModel(List<Contribution> theContributions) {
    	contributions = theContributions;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return contributions.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        Contribution tempContribution = contributions.get(row);
        switch (col) {
            case ID_COL:
                return tempContribution.getID();
			case C_DATE_COL:
                return tempContribution.getC_date();
			case ENV_NUM_COL:
                return tempContribution.getEnv_num();
            case AMT_COL:
                return tempContribution.getAmt();
			case FUND_NAME_COL:
                return tempContribution.getFund_name();
			case C_TYPE_COL:
                return tempContribution.getC_type();
            case NOTE_COL:
                return tempContribution.getNote();
            default:
                return tempContribution.getID();
        }
    }
	public boolean isCellEditable(int row, int col)
    {
		if(col == ID_COL)     //Cant edit ID
			return false;
		else
			return true; //Can edit everything else
    }
	
	public void setValueAt(Object aValue, int row, int col)
    {
		Contribution tempContribution = contributions.get(row);
		switch (col) {
			//case ID_COL:
                //tempContribution.setID((int) aValue); //Not sure what to do for ID
            case AMT_COL:
                tempContribution.setAmt((double) aValue);
            case C_DATE_COL:
                tempContribution.setC_date((Date) aValue);
            case NOTE_COL:
                tempContribution.setNote((String) aValue);
            case C_TYPE_COL:
                tempContribution.setC_type((String) aValue);
            case FUND_NAME_COL:
                tempContribution.setFund_name((String) aValue);
            case ENV_NUM_COL:
                tempContribution.setEnv_num((int) aValue);
        }
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}

