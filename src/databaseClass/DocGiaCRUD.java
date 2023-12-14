package databaseClass;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.util.Arrays;

public class DocGiaCRUD
{
    Connection conn = null;
    PreparedStatement sttm = null;

    public int add(DocGia user)
    {
        try
        {
            String sSQL = "insert into dbo.reader(ID,readerID,name,phone,address,email,gender,age,readerstatus)\n"
                    + "values (?,?,?,?,?,?,?,?,?);";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, user.getID());
            sttm.setInt(2, user.getUserID());
            sttm.setString(3, user.getName());
            sttm.setString(4, user.getPhone());
            sttm.setString(5, user.getAdrress());
            sttm.setString(6, user.getEmail());
            sttm.setString(7, user.getGender());
            sttm.setInt(8, user.getAge());
            sttm.setString(9, user.ENUM_TO_STRING(DocGia.ReaderStatus.READY_TO_BORROW));
            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    public int update(DocGia user)
    {
        try
        {
            String sSQL = "update dbo.reader \n"
                    + "set readerID=?,name=?,phone=?,address=?,email=?,gender=?,age=?,readerstatus=?\n"
                    + "where ID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, user.getUserID());
            sttm.setString(2, user.getName());
            sttm.setString(3, user.getPhone());
            sttm.setString(4, user.getAdrress());
            sttm.setString(5, user.getEmail());
            sttm.setString(6, user.getGender());
            sttm.setInt(7, user.getAge());
            sttm.setString(8, user.ENUM_TO_STRING(user.getStatus()));
            sttm.setInt(9, user.getID());
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

    public void delete(int id)
    {
        try
        {
            String sSQL = "delete reader where readerID=" + id;
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.executeUpdate();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<DocGia> getAll()
    {
        List<DocGia> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select ID,readerID,name,phone,address,email,gender,age,readerstatus from reader";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                DocGia user = new DocGia();
                user.setID(rs.getInt(1));
                user.setUserID(rs.getInt(2));
                user.setName(rs.getString(3));
                user.setPhone(rs.getString(4));
                user.setAdrress(rs.getString(5));
                user.setEmail(rs.getString(6));
                user.setGender(rs.getString(7));
                user.setAge(rs.getInt(8));
                user.setStatus(STRING_TO_ENUM(rs.getString(9)));
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

    public DocGia findReaderByReaderId(int UserID)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select ID,readerID,name,phone,address,email,gender,age,readerstatus from reader where readerID=" + UserID;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                DocGia user = new DocGia();
                user.setID(rs.getInt(1));
                user.setUserID(rs.getInt(2));
                user.setName(rs.getString(3));
                user.setPhone(rs.getString(4));
                user.setAdrress(rs.getString(5));
                user.setEmail(rs.getString(6));
                user.setGender(rs.getString(7));
                user.setAge(rs.getInt(8));
                user.setStatus(STRING_TO_ENUM(rs.getString(9)));
                return user;
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
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
    public DocGia findReaderById(int UserID)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select ID,readerID,name,phone,address,email,gender,age,readerstatus from reader where ID=" + UserID;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                DocGia user = new DocGia();
                user.setID(rs.getInt(1));
                user.setUserID(rs.getInt(2));
                user.setName(rs.getString(3));
                user.setPhone(rs.getString(4));
                user.setAdrress(rs.getString(5));
                user.setEmail(rs.getString(6));
                user.setGender(rs.getString(7));
                user.setAge(rs.getInt(8));
                user.setStatus(STRING_TO_ENUM(rs.getString(9)));
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
    public int updateTransactionStatus(int id,int readerstatus)
    {
        try
        {
            String sSQL = "update dbo.reader \n"
                    + "set readerstatus=?\n"
                    + "where readerID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, INT_TO_STRING(readerstatus));
            sttm.setInt(2, id);
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
    public int getMaxID()
    {

        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "SELECT MAX(ID) as 'maxID' FROM reader";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            int id = 1;
            while (rs.next())
            {
                id = rs.getInt("maxID");
            }
            rs.close();
            sttm.close();
            conn.close();
            return id;
        } catch (Exception e)
        {
            return -1;
        }
    }
    public boolean checkID(int newReaderID)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select readerID from reader";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            ArrayList<Integer> readerID = new ArrayList<>();
            while (rs.next())
            {
                readerID.add(rs.getInt("readerID"));
            }
            if(readerID.contains(newReaderID))
                return false;
            else
                return true;
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public DocGia.ReaderStatus STRING_TO_ENUM(String readerstatus)
    {
        return switch (readerstatus)
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
    public String INT_TO_STRING(int readerstatus)
    {
        return switch (readerstatus)
        {
            case 1,0 ->
                "READY";
            case 2 ->
                "BORROWING";
            case 3 ->
                "NOT RETURNED";
            default ->
                null;
        };
    }
}
