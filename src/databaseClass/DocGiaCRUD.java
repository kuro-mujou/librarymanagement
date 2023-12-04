package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DocGiaCRUD
{
    Connection conn = null;
    PreparedStatement sttm = null;

    public int add(DocGia user)
    {
        try
        {
            String sSQL = "insert into dbo.reader(userID,name,phone,address,email,gender,age,status)\n"
                    + "values (?,?,?,?,?,?,?,?);";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, user.getUserID());
            sttm.setString(2, user.getName());
            sttm.setString(3, user.getPhone());
            sttm.setString(4, user.getAdrress());
            sttm.setString(5, user.getEmail());
            sttm.setString(6, user.getGender());
            sttm.setInt(7, user.getAge());
            sttm.setString(8, user.ENUM_TO_STATUS(DocGia.ReaderStatus.READY_TO_BORROW));
            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }

    public int update(DocGia user)
    {
        try
        {
            String sSQL = "update dbo.reader \n"
                    + "set name=?,phone=?,address=?,email=?,gender=?,age=?,status=?,currentTransactionID=?\n"
                    + "where userID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, user.getName());
            sttm.setString(2, user.getPhone());
            sttm.setString(3, user.getAdrress());
            sttm.setString(4, user.getEmail());
            sttm.setString(5, user.getGender());
            sttm.setInt(6, user.getAge());
            sttm.setString(7, user.ENUM_TO_STATUS(user.getStatus()));
            sttm.setInt(8, user.getTransactionID());
            sttm.setInt(9, user.getUserID());
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

    public int delete(int userid)
    {
        try
        {
            String sSQL = "delete reader where userID=" + userid;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);

            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }

    public List<DocGia> getAll()
    {
        List<DocGia> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select userID,name,phone,address,email,gender,age,status from reader";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                DocGia user = new DocGia();
                user.setUserID(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPhone(rs.getString(3));
                user.setAdrress(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setGender(rs.getString(6));
                user.setAge(rs.getInt(7));
                user.setStatus(STATUS_TO_ENUM(rs.getString(8)));
                ls.add(user);
            }
        } catch (Exception e)
        {
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
        return ls;
    }

    public DocGia findReaderById(int UserID)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select userID,name,phone,address,email,gender,age,status,currentTransactionID from reader where userID=" + UserID;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                DocGia user = new DocGia();
                user.setUserID(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPhone(rs.getString(3));
                user.setAdrress(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setGender(rs.getString(6));
                user.setAge(rs.getInt(7));
                user.setStatus(STATUS_TO_ENUM(rs.getString(8)));
                user.setTransactionID(rs.getInt(9));
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
    public void newTransaction(DocGia user, int transactionID)
    {
        try
        {
            String sSQL = "update dbo.reader \n"
                    + "set currentTransactionID=?\n"
                    + "where userID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, transactionID);
            sttm.setInt(2, user.getUserID());
            sttm.close();
            conn.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public DocGia.ReaderStatus STATUS_TO_ENUM(String status)
    {
        return switch (status)
        {
            case "READY" ->
                DocGia.ReaderStatus.READY_TO_BORROW;
            case "BORROWING" ->
                DocGia.ReaderStatus.CURRENT_BORROWING;
            case "NOT RETURNED" ->
                DocGia.ReaderStatus.CURRENT_NOT_RETURN;
            default ->
                null;
        };
    }
}
