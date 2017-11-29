package dao;

import core.Fund;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FundDAO {

    private DBConnection conn;

    public FundDAO(DBConnection conn) {
        this.conn = conn;
    }

    public List<Fund> getAllFunds() throws Exception {
        List<Fund> list = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from fund");
            while (rs.next()) {
                Fund fund = convertRowToFund(rs);
                list.add(fund);
            }
            return list;
        } finally {
            conn.close(stmt, rs);
        }
    }

    public void addFund(Fund fund) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("insert into fund values (?, ?)");
            stmt.setString(1, fund.getName());
            stmt.setString(2, fund.getQBact());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    public void deleteFund(Fund fund) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("delete from fund where name = ?");
            stmt.setString(1, fund.getName());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    public void updateFund(Fund fund) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("update fund set qb_acct = ? where name = ?");
            stmt.setString(1, fund.getQBact());
            stmt.setString(2, fund.getName());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    private Fund convertRowToFund(ResultSet rs) throws Exception {
        String name = rs.getString("name");
        String qb_acc = rs.getString("qb_acct");
        return new Fund(name, qb_acc);
    }

}
