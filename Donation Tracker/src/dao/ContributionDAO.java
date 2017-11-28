package dao;

import core.Contribution;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ContributionDAO {

    private DBConnection conn;

    public ContributionDAO(DBConnection conn) {
        this.conn = conn;
    }

    public List<Contribution> getAllContributions() throws Exception {
        List<Contribution> list = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from contribution");
            while (rs.next()) {
                Contribution contribution = convertRowToContribution(rs);
                list.add(contribution);
            }
            return list;
        } finally {
            conn.close(stmt, rs);
        }
    }

    public void addContribution(Contribution contribution) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("insert into contribution values (null, ?, ?, ?, ?, ?, ?)");
            stmt.setDouble(1, contribution.getAmt());
            stmt.setDate(2, contribution.getC_date());
            stmt.setString(3, contribution.getNote());
            stmt.setString(4, contribution.getC_type());
            stmt.setString(5, contribution.getFund_name());
            stmt.setInt(6, contribution.getEnv_num());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    public void deleteContribution(Contribution contribution) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("delete from contribution where ID = ?");
            stmt.setInt(1, contribution.getID());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    public void updateContribution(Contribution contribution) throws Exception {
        PreparedStatement stmt = null;
        String sql = "update contribution "
                + "set amt = ?, "
                + "c_date = ?, "
                + "note = ?, "
                + "c_type = ?, "
                + "fund_name = ?, "
                + "env_num = ? "
                + "where ID = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setDouble(1, contribution.getAmt());
            stmt.setDate(2, contribution.getC_date());
            stmt.setString(3, contribution.getNote());
            stmt.setString(4, contribution.getC_type());
            stmt.setString(5, contribution.getFund_name());
            stmt.setInt(6, contribution.getEnv_num());
            stmt.setInt(7, contribution.getID());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    private Contribution convertRowToContribution(ResultSet rs) throws Exception {
        int ID = rs.getInt("ID");
        double amt = rs.getDouble("amt");
        Date date = rs.getDate("c_date");
        String note = rs.getString("note");
        String c_type = rs.getString("c_type");
        String fund = rs.getString("fund_name");
        int env_num = rs.getInt("env_num");
        return new Contribution(ID, amt, date, note, c_type, fund, env_num);
    }

}
