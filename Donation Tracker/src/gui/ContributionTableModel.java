/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.List;
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
    private String[] columnNames = {"ID", "amt", "c_date", "note","c_type","fund_name","env_num"};
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
            case AMT_COL:
                return tempContribution.getAmt();
            case C_DATE_COL:
                return tempContribution.getC_date();
            case NOTE_COL:
                return tempContribution.getNote();
            case C_TYPE_COL:
                return tempContribution.getC_type();
            case FUND_NAME_COL:
                return tempContribution.getFund_name();
            case ENV_NUM_COL:
                return tempContribution.getEnv_num();
            default:
                return tempContribution.getID();
        }
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}

