package dao;

import core.Donor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DonorDAO {

    private DBConnection conn;

    public DonorDAO(DBConnection conn) {
        this.conn = conn;
    }

    public List<Donor> getAllDonors() throws Exception {
        List<Donor> list = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from donor");
            while (rs.next()) {
                Donor donor = convertRowToDonor(rs);
                list.add(donor);
            }
            return list;
        } finally {
            conn.close(stmt, rs);
        }
    }

    public List<Integer> getAllEnvNums() throws Exception {
        List<Integer> list = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select env_num from donor");
            while (rs.next()) {
                int env_num = rs.getInt("env_num");
                list.add(env_num);
            }
            return list;
        } finally {
            conn.close(stmt, rs);
        }
    }

    public int getNextEnvNum() throws Exception {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select env_num from donor");
            int curr = 0, last = 0;
            while (rs.next()) {
                curr = rs.getInt("env_num");
                if (curr > last + 1) {
                    return last + 1;
                }
                last = curr;
            }
            return curr + 1;
        } finally {
            conn.close(stmt, rs);
        }
    }

    public void addDonor(Donor donor) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("insert into donor values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, donor.getEnv_num());
            stmt.setString(2, donor.getF_name());
            stmt.setString(3, donor.getL_name());
            stmt.setString(4, donor.getStreet());
            stmt.setString(5, donor.getCity());
            stmt.setString(6, donor.getState());
            stmt.setInt(7, donor.getZip());
            stmt.setString(8, donor.getEmail());
            stmt.setString(9, donor.getMail_pref());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    public void deleteDonor(Donor donor) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("delete from donor where env_num = ?");
            stmt.setInt(1, donor.getEnv_num());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    public void updateDonor(Donor donor) throws Exception {
        PreparedStatement stmt = null;
        String sql = "update donor "
                + "set f_name = ?, "
                + "l_name = ?, "
                + "street = ?, "
                + "city = ?, "
                + "state = ?, "
                + "zip = ?, "
                + "email = ?, "
                + "mail_pref = ? "
                + "where env_num = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, donor.getF_name());
            stmt.setString(2, donor.getL_name());
            stmt.setString(3, donor.getStreet());
            stmt.setString(4, donor.getCity());
            stmt.setString(5, donor.getState());
            stmt.setInt(6, donor.getZip());
            stmt.setString(7, donor.getEmail());
            stmt.setString(8, donor.getMail_pref());
            stmt.setInt(9, donor.getEnv_num());
            stmt.execute();
        } finally {
            conn.close(stmt, null);
        }
    }

    private Donor convertRowToDonor(ResultSet rs) throws Exception {
        int env_num = rs.getInt("env_num");
        String first = rs.getString("f_name");
        String last = rs.getString("l_name");
        String street = rs.getString("street");
        String city = rs.getString("city");
        String state = rs.getString("state");
        int zip = rs.getInt("zip");
        String email = rs.getString("email");
        String mail_pref = rs.getString("mail_pref");
        return new Donor(env_num, first, last, street, city, state, zip, email, mail_pref);
    }

}
