/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.List;
import core.Fund;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Travis Rowe
 */
public class FundTableModel extends AbstractTableModel{
	private static final int NAME_COL = 0;
    private static final int QB_ACT_COL = 1;
    private String[] columnNames = {"name", "qb_act"};
    private List<Fund> funds;
    
    public FundTableModel(List<Fund> f) {
    	funds = f;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return funds.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col) {
        Fund tempFund = funds.get(row);
        switch (col) {
            case NAME_COL:
                return tempFund.getName();
            case QB_ACT_COL:
                return tempFund.getQBact();
            default:
                return tempFund.getName();
        }
    }
    
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
