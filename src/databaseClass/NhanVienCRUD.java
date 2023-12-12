package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class NhanVienCRUD
{
    Connection conn = null;
    PreparedStatement sttm = null;
    
    public int add(NhanVien nhanVien)
    {
        try
        {
            String sSQL = "insert into dbo.Users(libID,name,phone,address,email,password,gender)\n"
                    + "values (?,?,?,?,?,?,?);";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, nhanVien.getMaNhanVien());
            sttm.setString(2, nhanVien.getTen());
            sttm.setString(3, nhanVien.getSoDienThoai());
            sttm.setString(4, nhanVien.getDiaChi());
            sttm.setString(5, nhanVien.getEmail());
            sttm.setString(6, nhanVien.getPassword());
            sttm.setString(7, nhanVien.getGioiTinh());
            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }
    public int updateBasicInfo(NhanVien user)
    {
        try
        {
            String sSQL = "update dbo.Users \n"
                    + "set name=?,phone=?,address=?,gender=?\n"
                    + "where libID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, user.getTen());
            sttm.setString(2, user.getSoDienThoai());
            sttm.setString(3, user.getDiaChi());
            sttm.setString(4,user.getGioiTinh());
            sttm.setInt(5, user.getMaNhanVien());
            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int updatePassword(NhanVien user)
    {
        try
        {
            String sSQL = "update dbo.Users \n"
                    + "set password=?\n"
                    + "where libID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, user.getPassword());
            sttm.setInt(2, user.getMaNhanVien());
            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public int updateEmail(NhanVien user)
    {
        try
        {
            String sSQL = "update dbo.Users \n"
                    + "set email=?\n"
                    + "where libID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, user.getEmail());
            sttm.setInt(2, user.getMaNhanVien());
            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public NhanVien findUser()
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select libID,name,phone,address,email,password,gender from Users";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                NhanVien user = new NhanVien();
                user.setMaNhanVien(rs.getInt(1));
                user.setTen(rs.getString(2));
                user.setSoDienThoai(rs.getString(3));
                user.setDiaChi(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setPassword(rs.getString(6));
                user.setGioiTinh(rs.getString(7));
                return user;
            }
        } catch (Exception e)
        {
            return null;
        } finally
        {
            try
            {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e)
            {
            }
        }
        return null;
    }
}
